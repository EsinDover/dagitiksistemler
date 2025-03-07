package com.example.demo.service;

import com.example.demo.entity.Bitki;
import com.example.demo.repository.BitkiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitkiServiceImpl implements BitkiService{
    private final BitkiRepository bitkiRepository;

    public BitkiServiceImpl(BitkiRepository bitkiRepository) {
        this.bitkiRepository = bitkiRepository;
    }

    @Override
    public List<Bitki> tumBitkileriGetir() {
        return bitkiRepository.findAll();
    }

    @Override
    public Bitki bitkiGetirIdIle(Long id) {
        return bitkiRepository.findById(id).orElse(null);
    }

    @Override
    public Bitki bitkiKaydet(Bitki bitki) {
        return bitkiRepository.save(bitki);
    }

    @Override
    public void bitkiSil(Long id) {
        bitkiRepository.deleteById(id);
    }

}



