package com.example.demo.service;

import com.example.demo.entity.Bitki;

import java.util.List;

public interface BitkiService {
    List<Bitki> tumBitkileriGetir();
    Bitki bitkiGetirIdIle(Long id);
    Bitki bitkiKaydet(Bitki bitki);
    void bitkiSil(Long id);
}


