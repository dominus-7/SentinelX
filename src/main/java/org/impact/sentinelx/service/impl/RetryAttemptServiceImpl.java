// src/main/java/com/giteck/academy/sentinelx/service/impl/RetryAttemptServiceImpl.java
package org.impact.sentinelx.service.impl;

import org.impact.sentinelx.dto.RetryAttemptDTO;
import org.impact.sentinelx.entity.RetryAttempt;
import org.impact.sentinelx.mapping.RetryAttemptMapper;
import org.impact.sentinelx.repository.RetryAttemptRepository;
import org.impact.sentinelx.repository.RetryExecutionRepository;
import org.impact.sentinelx.service.RetryAttemptService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RetryAttemptServiceImpl implements RetryAttemptService {
    private final RetryAttemptRepository repository;
    private final RetryAttemptMapper mapper;
    private final RetryExecutionRepository executionRepository;


    @Override
    public RetryAttemptDTO save(RetryAttemptDTO dto) {
        RetryAttempt entity = mapper.toEntity(dto);
        if (dto.getRetryExecutionId() != null) {
            entity.setRetryExecution(executionRepository.findById(dto.getRetryExecutionId()).orElse(null));
        }
        return mapper.toDto(repository.save(entity));
    }
    @Override
    public RetryAttemptDTO update(RetryAttemptDTO dto) {
        RetryAttempt entity = mapper.toEntity(dto);
        if (dto.getRetryExecutionId() != null) {
            entity.setRetryExecution(executionRepository.findById(dto.getRetryExecutionId()).orElse(null));
        }
        return mapper.toDto(repository.save(entity));
    }
    @Override
    public RetryAttemptDTO findById(Long id) { return repository.findById(id).map(mapper::toDto).orElse(null); }
    @Override
    public List<RetryAttemptDTO> findAll() { return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList()); }
    @Override
    public void deleteById(Long id) { repository.deleteById(id); }
}