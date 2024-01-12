<template>
  <div class="combo-items">
    <div v-for="combo in combos" :key="combo.comboId" class="button">
      <div class="button-content">
      <p>Combo Name: {{ combo.comboName }}</p>
      <p>Combo Price: {{ combo.comboPrice }}</p>
      </div>
    </div>
  </div>
</template>


<script>
import ComboService from "../services/comboService.js";

export default {
  data() {
    return {
      combos: [
        {
          comboId: "",
          comboName: "",
          comboPrice: "",
          description: "",
        },
      ],
    };
  },

  created() {
    ComboService.getCombos().then((response) => {
      if (response.status === 200) {
        this.combos = response.data.map((comboItem) => {
          return {
            comboId: comboItem.comboId,
            comboName: comboItem.comboName,
            comboPrice: comboItem.comboPrice,
            description: comboItem.description,
          };
        });
        console.log(response.data);
      }
    });
  },
};
</script>

<style>
.button{
  display: inline-flex;
  border: 1px solid #ccc;
    border-radius: 8px;
    padding: 16px;
    margin: 16px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    background-color: #fff;
  height: 200px;
}
.button:hover{
  background-color: #ff181877;

}



</style>
