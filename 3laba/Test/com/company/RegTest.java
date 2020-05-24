package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegTest {

    @Test
    void getInfoById() {
        Reg reg = new Reg();
       Card Card1 = reg.GetInfoById(reg.Cards.get(0).Identificator);
        assertEquals(reg.Cards.get(0), Card1);
    }

    @Test
    void arrayAdder() {
        Card card = new Card (1,"general",30);
        Reg reg = new Reg();
        reg.ArrayAdder(1,"general",30);
        assertEquals(card.Descents, reg.Cards.get(1).Descents);
        assertEquals(card.Identificator, reg.Cards.get(1).Identificator);
        assertEquals(card.Type, reg.Cards.get(1).Type);
    }

    @Test
    void cardBlocker() {
        Reg reg = new Reg();
        Card card = reg.Cards.get(0);
        reg.CardBlocker(reg.Cards.get(0));
        assertEquals(card.Type, reg.BlockedCards.get(0).Type);
        assertEquals(card.Identificator, reg.BlockedCards.get(0).Identificator);
        assertEquals(card.Descents, reg.BlockedCards.get(0).Descents);
    }
}