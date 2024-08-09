package com.busycoder.accounts.serviceproxy;

import org.springframework.stereotype.Component;

import com.busycoder.accounts.dto.CardDto;

@Component
public class CardFallBack implements CardServiceProxy{
    @Override
    public CardDto findByMobileNumber(String mobile) {
        return new CardDto();
    }
}