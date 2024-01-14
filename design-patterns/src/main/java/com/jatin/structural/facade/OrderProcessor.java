package com.jatin.structural.facade;

public class OrderProcessor { // hiding the complexity
    private  PaymentService paymentService = new PaymentService();

    private  InventoryService inventoryService = new InventoryService();

    private  RecommendationService recommendationService = new RecommendationService();

    private  AnalyticsService analyticsService = new AnalyticsService();

    public void process(){
        // Pay
        paymentService.pay();
        // Update
        inventoryService.checkInventory();
        // Analytics
        recommendationService.recommend();
        analyticsService.track();
    }
}
