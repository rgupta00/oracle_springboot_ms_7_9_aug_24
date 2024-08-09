package com.busycoder.accounts.serviceproxy;

import org.springframework.stereotype.Component;

import com.busycoder.accounts.dto.LoanDto;

@Component
public class LoanFallBack implements LoanServiceProxy{
    @Override
    public LoanDto getByMobile(String mobile) {
        return new LoanDto();
    }
}