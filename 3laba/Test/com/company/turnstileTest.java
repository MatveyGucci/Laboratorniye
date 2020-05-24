package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class turnstileTest {

    @Test
    void check() {
        turnstile turnstile = new turnstile();
        assertEquals(true,turnstile.check(turnstile.Cards.get(0)));
    }

    @Test
    void enter() {
        turnstile turnstile = new turnstile();
        Card card = new Card(1, "general",30);
        turnstile.enter(card);
        assertEquals(29,card.Descents);
    }
    @Test
    void getinfobycard() {
        Card card = new Card(1,"general",22);
        turnstile turnstile = new turnstile();
        bd bd =new bd(true,card);
        turnstile.attempts.add(bd);
        bd bd1 = turnstile.attempts.get(0);
        assertEquals(bd.whotried.Type, bd1.whotried.Type);
    }
}