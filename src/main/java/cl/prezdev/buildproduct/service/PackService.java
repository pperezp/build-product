package cl.prezdev.buildproduct.service;

import cl.prezdev.buildproduct.domain.dto.PackDto;

import java.util.List;

public interface PackService {
    List<PackDto> findAllPacks();
}
