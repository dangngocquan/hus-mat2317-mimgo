package lastTerm.Y20212022.Code01.exercise04;

public class AbstractCountry {

    public String getCode() {
        return "I do not have code";
    }

    public String getName() {
        return "I do not have name";
    }

    public int getPopulation() {
        return -1;
    }

    public double getArea() {
        return -1.0;
    }

    public double getGdp() {
        return -1.0;
    }

    public String getContinent() {
        return "I do not have continent";
    }

    @Override
    public String toString() {
        return "Country[" +
                "code='" + this.getCode() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", population=" + this.getPopulation() +
                ", area=" + this.getArea() +
                ", gdp=" + this.getGdp() +
                ", continent='" + this.getContinent() + '\'' +
                ']';
    }
}
