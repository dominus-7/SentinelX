// src/main/java/com/giteck/academy/sentinelx/controller/AccountController.java
package org.impact.sentinelx.controller;

import org.impact.sentinelx.dto.AccountDTO;
import org.impact.sentinelx.security.SimulatedSecurityContextHolder;
import org.impact.sentinelx.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @GetMapping("/all")
    public List<AccountDTO> getAll() {
        System.out.println(">>> Utilisateur intercepté : " + SimulatedSecurityContextHolder.getCurrentUsername());
        return service.findAll();
    }


    @GetMapping("/find_by_id/{id}")
    public AccountDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/save")
    public AccountDTO save(@Valid @RequestBody AccountDTO dto) {
        return service.save(dto);
    }

    @PostMapping("/update")
    public AccountDTO update(@Valid @RequestBody AccountDTO dto) {
        return service.update(dto);
    }

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}