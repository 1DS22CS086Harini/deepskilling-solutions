public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Investor1");
        Observer web = new WebApp("Investor2");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setPrice(150.75);
        market.setPrice(155.20);
        market.removeObserver(web);
        market.setPrice(160.00);
    }
}