package web.model;

public class Car {
    private String name;
    private int series;
    private int yearOfRelease;

    public Car() {
    }

    public Car(String name, int series, int yearOfRelease) {
        this.name = name;
        this.series = series;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
