package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    }
    }
    class Card {
        int Identificator;
        String Type;
        int Descents;

        public Card(int Identificator, String Type, int Descents) {
            this.Identificator = Identificator;
            this.Type = Type;
            this.Descents = Descents;
        }

    }
    class Reg {
        ArrayList<Card> Cards = new ArrayList<>();
        ArrayList<Card> BlockedCards = new ArrayList<>();
        public Reg (){
            adderauto();
        }
        public void adderauto()
        {
            Card card1 = new Card (1, "general",35);
            Card card2 = new Card (2, "general",30);
            Card card3 = new Card (3, "general",33);
            Card card4 = new Card (4, "general",27);
            Card card5 = new Card (5, "general",40);
            Cards.add(card1);//Cards.add(card2);Cards.add(card3);Cards.add(card4);Cards.add(card5);
        }
        public Card GetInfoById(int Identificator) {
            for (int i = 0; i < Cards.size(); i++) {
                if (Cards.get(i).Identificator == Identificator) {
                    return (Cards.get(i));
                }
            }
            return (null);
        }

        public void ArrayAdder(int Identificator, String type, int Descent) {
            Card GeneralCard = new Card(Identificator, type, Descent);
            Cards.add(GeneralCard);
        }

        public void CardBlocker(Card card) {
            for (int i = 0; i < Cards.size(); i++) {
                if (Cards.get(i) == card) {
                    Cards.remove(i);
                    BlockedCards.add(card);
                }
            }
        }
    }

    class turnstile {

        Reg register = new Reg();
            ArrayList<Card> Cards = register.Cards;
            ArrayList<Card> Blocked = register.BlockedCards;
            ArrayList<bd> attempts = new ArrayList<>();
            public ArrayList<bd> getgeneral()
        {
            ArrayList<bd> general = new ArrayList<bd>();
            for (int i =0; i< attempts.size(); i++)
            {
                if (attempts.get(i).whotried.Type == "general")
                {
                    general.add(attempts.get(i));
                }
            }
            return general;
        }
        public turnstile()
        {
            Card card = new Card(1, "general", 30);
            Cards.add(card);
        }
            public boolean check (Card card)
            {

                for (int i = 0; i<Cards.size(); i++){
                    if (Cards.get(i) == card) {
                        if (card.Descents <= 0) {
                            return (false);
                        }
                        else return (true);
                    }
                }
                for (int i = 0; i<Blocked.size(); i++){
                    if (Blocked.get(i) == card){
                        return (false);
                    }
                }
                return (false);
            }
            public void warn (){
                System.out.println("Please check certificate of this person");
            }
            public void enter (Card card)
            {
                    if (card.Type != "generous") {
                        card.Descents -= 1;
                        bd att = new bd(true, card);
                        attempts.add(att);
                    } else warn();
                    bd att = new bd(true, card);
                    attempts.add(att);
            }
            public ArrayList<bd> getallinfo ()
        {
            return (attempts);
        }

            public bd getinfobycard (Card card){
            for (int i =0; i<attempts.size(); i++)
            {
                if (attempts.get(i).whotried == card)
                {
                    return (attempts.get(i));
                }
            }
            return null;
        }
    }
    class bd {
        boolean entered;
        Card whotried;

        public bd(boolean entered, Card whotried) {
            this.entered = entered;
            this.whotried = whotried;

        }
    }