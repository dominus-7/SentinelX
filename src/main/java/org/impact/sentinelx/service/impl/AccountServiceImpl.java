// src/main/java/com/giteck/academy/sentinelx/service/impl/AccountServiceImpl.java
package org.impact.sentinelx.service.impl;

import org.impact.sentinelx.aspect.audit.SecureAudit;
import org.impact.sentinelx.dto.AccountDTO;
import org.impact.sentinelx.entity.Account;
import org.impact.sentinelx.mapping.AccountMapper;
import org.impact.sentinelx.repository.AccountRepository;
import org.impact.sentinelx.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;
    private final AccountMapper mapper;



    @Override
    @SecureAudit(action = "ACCOUNT_CREATE", sensitive = true, logResult = true)
    public AccountDTO save(AccountDTO dto) {
        if(repository.findByAccountNumber(dto.getAccountNumber()).isPresent()){
            throw new RuntimeException("Un compte avec ce numéro existe déjà.");
        }
        Account entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public AccountDTO update(AccountDTO dto) {
        Account entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public AccountDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Compte introuvable"));
    }

    @Override
    public List<AccountDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}