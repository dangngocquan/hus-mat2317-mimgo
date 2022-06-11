public class CountryData {
    private String code;
    private String name;
    private int population;
    private double area;
    private double gdp;
    private String continent;

    // Constructor
    public CountryData(String code,
                       String name,
                       int population,
                       double area,
                       double gdp,
                       String continent) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.continent = continent;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return this.population;
    }

    public double getArea() {
        return this.area;
    }

    public double getGdp() {
        return this.gdp;
    }

    public String getContinent() {
        return this.continent;
    }

    @Override
    public String toString() {
        return "CountryData[" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", continent='" + continent + '\'' +
                ']';
    }
}