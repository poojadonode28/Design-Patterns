package com.jatin.structural.facade;

public class Main {
    /*
    private static PaymentService paymentService = new PaymentService(); // so that it might be reusable

    private static InventoryService inventoryService = new InventoryService();

    private static RecommendationService recommendationService = new RecommendationService();

    private static AnalyticsService analyticsService = new AnalyticsService();
    */

    private static OrderProcessor orderProcessor = new OrderProcessor();

    public static void main(String[] args) {
        /*
        // Pay
        paymentService.pay();
        // Update
        inventoryService.checkInventory();
        // Analytics
        recommendationService.recommend();
        analyticsService.track();
         */
        orderProcessor.process();
    }
}
