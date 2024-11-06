package com.wang.response;

import com.wang.enmu.HttpStatusCode;
import lombok.Data;

@Data
public class ApiResponse<T> {
    private HttpStatusCode status;
    private String message;
    private T data;

    public ApiResponse(HttpStatusCode status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResponse<T>success(String message,T data){
       return new ApiResponse<>(HttpStatusCode.OK,message,data);
    }
   public static <T> ApiResponse<T>error(String message){
        return new ApiResponse<>(HttpStatusCode.INTERNAL_SERVER_ERROR,message,null);
   }
   public static <T> ApiResponse<T>success(T data){
        return new ApiResponse<>(HttpStatusCode.OK,"success",data);
   }

}
