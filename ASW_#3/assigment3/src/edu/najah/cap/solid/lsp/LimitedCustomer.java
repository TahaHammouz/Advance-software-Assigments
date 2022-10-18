package edu.najah.cap.solid.lsp;


public class LimitedCustomer extends Client{

    private static final int MAX_ALLOWED_OFFER = 3;

    public void addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()){
            System.err.println("Limited customer can not add more that " + MAX_ALLOWED_OFFER + " offers" );
            return;
        }
        super.addOffers(offer);
    }

    private boolean isReachedMaxAllowedOffers() {
        return offers.size() >= MAX_ALLOWED_OFFER;
    }

}
