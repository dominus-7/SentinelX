package org.impact.sentinelx.mapping;

import org.impact.sentinelx.entity.ProfilingSpan;
import org.impact.sentinelx.dto.ProfilingSpanDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProfilingSpanMapper {
    public ProfilingSpanDTO toDto(ProfilingSpan entity) {
        if (entity == null) return null;
        ProfilingSpanDTO dto = new ProfilingSpanDTO();
        BeanUtils.copyProperties(entity, dto);
        if (entity.getTrace() != null) {
            dto.setTraceId(entity.getTrace().getTraceId());
        }
        return dto;
    }
    public ProfilingSpan toEntity(ProfilingSpanDTO dto) {
        if (dto == null) return null;
        ProfilingSpan entity = new ProfilingSpan();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}