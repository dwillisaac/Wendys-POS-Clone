package com.example.Wendys.DAO;

import com.example.Wendys.Model.ComboItem;
import org.hibernate.exception.JDBCConnectionException;
import org.postgresql.util.PSQLException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class jdbcComboDao implements ComboDao {

    private final JdbcTemplate jdbcTemplate;

    public jdbcComboDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ComboItem> getAllCombos() {
        List<ComboItem> comboItems = new ArrayList<>();
        String sql = "SELECT combo_id, combo_name, combo_price, description FROM Combo_items;";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while(results.next()){
                ComboItem comboItem = mapToRowCombos(results);
                comboItems.add(comboItem);
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new RuntimeException("Cannot get Database Connection", e);
        }
        return comboItems;
    }

    private ComboItem mapToRowCombos(SqlRowSet rowSet){
        ComboItem comboItem = new ComboItem();
        comboItem.setComboId(rowSet.getInt(("combo_id")));
        comboItem.setComboName(rowSet.getString("combo_name"));
        comboItem.setComboPrice(rowSet.getDouble("combo_price"));
        comboItem.getDescription(rowSet.getString("description"));
        return comboItem;
    }
}
