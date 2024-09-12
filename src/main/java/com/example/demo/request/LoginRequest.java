package com.example.demo.request;

public record LoginRequest(
  String tipodocumento,
  int documento,
  String password) {
}
