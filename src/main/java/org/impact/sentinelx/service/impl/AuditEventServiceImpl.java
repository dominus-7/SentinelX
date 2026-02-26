// AuditEventServiceImpl.java
package org.impact.sentinelx.service.impl;

import org.impact.sentinelx.dto.AuditEventDTO;
import org.impact.sentinelx.entity.AuditEvent;
import org.impact.sentinelx.mapping.AuditEventMapper;
import org.impact.sentinelx.repository.AuditEventRepository;
import org.impact.sentinelx.service.AuditEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuditEventServiceImpl implements AuditEventService {
    private final AuditEventRepository repository;
    private final AuditEventMapper mapper;


    @Override
    public AuditEventDTO save(AuditEventDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public AuditEventDTO update(AuditEventDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public AuditEventDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    @Override
    public List<AuditEventDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}