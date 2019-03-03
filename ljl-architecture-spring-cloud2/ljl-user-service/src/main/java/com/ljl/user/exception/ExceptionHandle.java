package com.ljl.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandle {
  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<String> handleException(Exception ex) {
    return new ResponseEntity<>(ex.getMessage(), HttpStatus.OK);
  }
}
