package com.example.resourceserver.util;

import lombok.Data;

@Data
public class SingleResultBundle<T> {

    private int resultCode;

    private T message;

    public static <T> SingleResultBundle success(T message){
        SingleResultBundle<T> result = new SingleResultBundle<>();
        result.setResultCode(200);
        result.setMessage(message);
        return result;
    }

    public static <T> SingleResultBundle failed(T message){
        SingleResultBundle<T> result = new SingleResultBundle<>();
        result.setResultCode(500);
        result.setMessage(message);
        return result;
    }

    @Data
    static class Result<T>{
        private int resultCode;

        private T message;

    }
}
