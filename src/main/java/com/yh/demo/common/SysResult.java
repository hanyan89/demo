package com.yh.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.MDC;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysResult<T> {
    private T data;
    private String message;
    private Integer code;
    private String traceId;

    public static <T> SysResult<T> ok(T data) {
        return new SysResult<T>(data, "", 200, "");
    }

    public static <T> SysResult<T> fail(String message) {
        return new SysResult<T>(null, message, 500, MDC.get("TRACE_ID"));
    }
}
