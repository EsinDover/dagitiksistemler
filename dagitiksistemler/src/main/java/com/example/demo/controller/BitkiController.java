package com.example.demo.controller;

import com.example.demo.entity.Bitki;
import com.example.demo.service.BitkiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bitkiler")
public class BitkiController {
    private final BitkiService bitkiService;

    public BitkiController(BitkiService bitkiService) {
        this.bitkiService = bitkiService;
    }

    @GetMapping
    public List<Bitki> tumBitkileriGetir() {
        return bitkiService.tumBitkileriGetir();
    }

    @GetMapping("/{id}")
    public Bitki bitkiGetirIdIle(@PathVariable Long id) {
        return bitkiService.bitkiGetirIdIle(id);
    }

    @PostMapping
    public Bitki bitkiKaydet(@RequestBody Bitki bitki) {
        return bitkiService.bitkiKaydet(bitki);
    }

    @PutMapping("/{id}")
    public Bitki bitkiGuncelle(@PathVariable Long id, @RequestBody Bitki bitki) {
        Bitki mevcutBitki = bitkiService.bitkiGetirIdIle(id);
        if (mevcutBitki != null) {
            mevcutBitki.setAd(bitki.getAd());
            mevcutBitki.setTur(bitki.getTur());
            return bitkiService.bitkiKaydet(mevcutBitki);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void bitkiSil(@PathVariable Long id) {
        bitkiService.bitkiSil(id);
    }
}

