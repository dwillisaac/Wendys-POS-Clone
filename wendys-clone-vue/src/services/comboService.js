import axios from "axios";

const http = axios.create({
    baseURL : "http://localhost:8081/"
});


export default{

getCombos(){
    return http.get('/combos')
}

}