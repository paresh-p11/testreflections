public class Car {
    int modelNo;
    String modelName;
    private String parentCompany;
    private int launchYear;
    Long marketPrice;

    public Car(int modelNo, String modelName, String parentCompany, int launchYear, Long marketPrice) {
        this.modelNo = modelNo;
        this.modelName = modelName;
        this.parentCompany = parentCompany;
        this.launchYear = launchYear;
        this.marketPrice = marketPrice;
    }

    public Car() {
        this.modelNo = 0;
        this.modelName = "";
        this.parentCompany = "";
        this.launchYear = 0;
        this.marketPrice = 0L;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private int getLaunchYear() {
        return launchYear;
    }

    private void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNo=" + modelNo +
                ", modelName='" + modelName + '\'' +
                ", parentCompany='" + parentCompany + '\'' +
                ", launchYear=" + launchYear +
                ", marketPrice=" + marketPrice +
                '}';
    }

    public void buyCar(Car car) {
        System.out.println("Congrats! you bought a " + car.modelName + "\nDetails:\n" + car.toString());
    }

    private String printDetails(String detailLevel) {
        if (detailLevel.equalsIgnoreCase("short")) {
            return "Details: " + getModelName() + "-" + getModelNo();
        }
        if (detailLevel.equalsIgnoreCase("detailed")) {
            return "Details: " + this.toString();
        }
        return null;
    }


}
