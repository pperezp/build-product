package cl.prezdev.buildproduct.service;

import cl.prezdev.buildproduct.domain.dto.PackDto;
import cl.prezdev.buildproduct.domain.model.Pack;

import java.util.List;

public interface PackService {
    List<PackDto> findAllPacks();

    Pack create(Pack pack);
}
