// src/main/java/com/giteck/academy/sentinelx/service/impl/RetryExecutionServiceImpl.java
package org.impact.sentinelx.service.impl;

import org.impact.sentinelx.dto.RetryExecutionDTO;
import org.impact.sentinelx.mapping.RetryExecutionMapper;
import org.impact.sentinelx.repository.RetryExecutionRepository;
import org.impact.sentinelx.service.RetryExecutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RetryExecutionServiceImpl implements RetryExecutionService {
    private final RetryExecutionRepository repository;
    private final RetryExecutionMapper mapper;


    @Override
    public RetryExecutionDTO save(RetryExecutionDTO dto) { return mapper.toDto(repository.save(mapper.toEntity(dto))); }
    @Override
    public RetryExecutionDTO update(RetryExecutionDTO dto) { return mapper.toDto(repository.save(mapper.toEntity(dto))); }
    @Override
    public RetryExecutionDTO findById(Long id) { return repository.findById(id).map(mapper::toDto).orElse(null); }
    @Override
    public List<RetryExecutionDTO> findAll() { return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList()); }
    @Override
    public void deleteById(Long id) { repository.deleteById(id); }
}