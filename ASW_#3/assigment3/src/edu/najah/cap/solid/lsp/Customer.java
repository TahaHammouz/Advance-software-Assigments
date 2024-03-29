package edu.najah.cap.solid.lsp;

import java.util.ArrayList;

public class Customer extends Client {

    public Customer(){
        offers = new ArrayList<>();
    }

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}