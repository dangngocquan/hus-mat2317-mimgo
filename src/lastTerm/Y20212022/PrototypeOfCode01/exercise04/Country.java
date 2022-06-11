public class Country extends AbstractCountry {
    
    private CountryData data;

    public Country(String code,
                   String name,
                   int population,
                   double area,
                   double gdp,
                   String continent) {
        this.data = new CountryData(code, name, population, area, gdp, continent);
    }

    @Override
    public String getCode() {
        return data.getCode();
    }

    @Override
    public String getName() {
        return data.getName();
    }

    @Override
    public int getPopulation() {
        return data.getPopulation();
    }

    @Override
    public double getArea() {
        return data.getArea();
    }

    @Override
    public double getGdp() {
        return data.getGdp();
    }

    @Override
    public String getContinent() {
        return data.getContinent();
    }
}