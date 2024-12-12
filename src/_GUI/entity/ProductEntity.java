package _GUI.entity;

public class ProductEntity {
    private String productNum;

    private String getProductNum;

    private int stockNum;

    private int  unitPrice;

    private String manufacturer;

    public String getProductNum() {
        return productNum;
    }


    public String getGetProductNum() {
        return getProductNum;
    }

    public void setGetProductNum(String getProductNum) {
        this.getProductNum = getProductNum;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
