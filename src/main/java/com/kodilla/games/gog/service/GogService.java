package com.findbestdeal.backend.gog.service;

import com.findbestdeal.backend.gog.domain.GogGame;
import com.findbestdeal.backend.gog.repository.GogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GogService {
    private GogRepository gogRepository;

    public GogService(GogRepository gogRepository) {
        this.gogRepository = gogRepository;
    }

    public Iterable<GogGame> list() {
        return gogRepository.findAll();
    }

    public Iterable<GogGame> save(List<GogGame> games) {
        return gogRepository.saveAll(games);
    }
}
