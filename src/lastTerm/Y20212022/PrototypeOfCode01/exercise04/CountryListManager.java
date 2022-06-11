import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {
    // Dữ liệu được lưu
    private List<AbstractCountry> countryList;

    // Hàm dựng
    public CountryListManager() {
        countryList = new LinkedList<>();
    }
    
    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    // Thêm dữ liệu vào cuối countryList
    public void append(AbstractCountry country) {
        /* TODO */
    }

    // Thêm dữ liệu vào vị trí index
    public void add(AbstractCountry country, int index) {
        /* TODO */
    }

    // Xóa dữ liệu tại vị trí index
    public void remove(int index) {
        /* TODO */
    }

    // Xóa các dữ liệu trong countryList
    public void remove(Country country) {
        /* TODO */
    }

    // Lấy dữ liệu ở vị trí index
    public AbstractCountry countryAt(int index) {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo dân số tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByPopulation() {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo dân số giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByPopulation() {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo diện tích tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByArea() {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo diện tích giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByArea() {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo GDP tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByGdp() {
        /* TODO */
    }

    // Sắp xếp dữ liệu theo GDP giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByGdp() {
        /* TODO */
    }

    // Lọc dữ liệu theo continent.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
    }
    
    // Lọc ra howMany nước đông dân nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        /* TODO */
    }

    // Lọc ra howMany nước ít dân nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        /* TODO */
    }

    // Lọc ra howMany nước có diện tích lớn nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        /* TODO */
    }
    
    // Lọc ra howMany nước có diện tích nhỏ nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        /* TODO */
    }

    // Lọc ra howMany nước có GDP cao nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        /* TODO */
    }

    // Lọc ra howMany nước có GDP thấp nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        /* TODO */
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}