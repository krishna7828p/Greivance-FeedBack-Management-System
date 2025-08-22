import axios from "axios";

export const getMapping=(url,options)=>{
    return axios.get("http://localhost:8082"+url,options);
}

export const postMapping=(url,value,options)=>{
    // console.log("http://localhost:8082")
    return axios.post("http://localhost:8082"+url,value,options);
    // return axios.post("http://localhost:8082"+url,value,options);
}

export const putMapping=(url,data,options)=>{
    return axios.put("http://localhost:8082"+url,data,options);
}

export const deleteMapping=(url,options)=>{
    return axios.delete("http://localhost:8082"+url,options);
}
