package edu.najah.cap.solid.lsp;


import java.util.ArrayList;

public abstract class Client {
    protected ArrayList<Offer> offers = null;

    protected void addOffers(Offer offer) {
        this.offers.add(offer);
    }
    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
}
