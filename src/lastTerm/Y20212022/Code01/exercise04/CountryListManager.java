package lastTerm.Y20212022.Code01.exercise04;

import java.util.ArrayList;
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
        countryList.add(country)
;    }

    // Thêm dữ liệu vào vị trí index
    public void add(AbstractCountry country, int index) {
        countryList.add(index, country);
    }

    // Xóa dữ liệu tại vị trí index
    public void remove(int index) {
        countryList.remove(index);
    }

    // Xóa các dữ liệu trong countryList
    public void remove(Country country) {
        countryList.remove(country);
    }

    // Lấy dữ liệu ở vị trí index
    public AbstractCountry countryAt(int index) {
        return countryList.get(index);
    }

    // Sắp xếp dữ liệu theo dân số tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> ansList = new ArrayList<>();
        for (AbstractCountry abstractCountry : countryList) {
        	ansList.add(abstractCountry);
        }
        
        for (int turn = 1; turn <= ansList.size(); turn++) {
        	for (int i = 0; i < ansList.size() - 1; i++) {
        		AbstractCountry country1 = ansList.get(i);
        		AbstractCountry country2 = ansList.get(i+1);
        		if (country1.getPopulation() > country2.getPopulation()) {
        			ansList.set(i, country2);
        			ansList.set(i+1, country1);
        		}
        	}
        }
        return ansList;
    }

    // Sắp xếp dữ liệu theo dân số giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByPopulation() {
    	 List<AbstractCountry> ansList = new ArrayList<>();
         for (AbstractCountry abstractCountry : countryList) {
         	ansList.add(abstractCountry);
         }
         
         for (int turn = 1; turn <= ansList.size(); turn++) {
         	for (int i = 0; i < ansList.size() - 1; i++) {
         		AbstractCountry country1 = ansList.get(i);
         		AbstractCountry country2 = ansList.get(i+1);
         		if (country1.getPopulation() < country2.getPopulation()) {
         			ansList.set(i, country2);
         			ansList.set(i+1, country1);
         		}
         	}
         }
         return ansList;
    }

    // Sắp xếp dữ liệu theo diện tích tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByArea() {
    	 List<AbstractCountry> ansList = new ArrayList<>();
         for (AbstractCountry abstractCountry : countryList) {
         	ansList.add(abstractCountry);
         }
         
         for (int turn = 1; turn <= ansList.size(); turn++) {
         	for (int i = 0; i < ansList.size() - 1; i++) {
         		AbstractCountry country1 = ansList.get(i);
         		AbstractCountry country2 = ansList.get(i+1);
         		if (country1.getArea() > country2.getArea()) {
         			ansList.set(i, country2);
         			ansList.set(i+1, country1);
         		}
         	}
         }
         return ansList;
    }

    // Sắp xếp dữ liệu theo diện tích giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByArea() {
    	List<AbstractCountry> ansList = new ArrayList<>();
        for (AbstractCountry abstractCountry : countryList) {
        	ansList.add(abstractCountry);
        }
        
        for (int turn = 1; turn <= ansList.size(); turn++) {
        	for (int i = 0; i < ansList.size() - 1; i++) {
        		AbstractCountry country1 = ansList.get(i);
        		AbstractCountry country2 = ansList.get(i+1);
        		if (country1.getArea() < country2.getArea()) {
        			ansList.set(i, country2);
        			ansList.set(i+1, country1);
        		}
        	}
        }
        return ansList;
    }

    // Sắp xếp dữ liệu theo GDP tăng dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortIncreasingByGdp() {
    	List<AbstractCountry> ansList = new ArrayList<>();
        for (AbstractCountry abstractCountry : countryList) {
        	ansList.add(abstractCountry);
        }
        
        for (int turn = 1; turn <= ansList.size(); turn++) {
        	for (int i = 0; i < ansList.size() - 1; i++) {
        		AbstractCountry country1 = ansList.get(i);
        		AbstractCountry country2 = ansList.get(i+1);
        		if (country1.getGdp() > country2.getGdp()) {
        			ansList.set(i, country2);
        			ansList.set(i+1, country1);
        		}
        	}
        }
        return ansList;
    }

    // Sắp xếp dữ liệu theo GDP giảm dần.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> sortDecreasingByGdp() {
    	List<AbstractCountry> ansList = new ArrayList<>();
        for (AbstractCountry abstractCountry : countryList) {
        	ansList.add(abstractCountry);
        }
        
        for (int turn = 1; turn <= ansList.size(); turn++) {
        	for (int i = 0; i < ansList.size() - 1; i++) {
        		AbstractCountry country1 = ansList.get(i);
        		AbstractCountry country2 = ansList.get(i+1);
        		if (country1.getGdp() < country2.getGdp()) {
        			ansList.set(i, country2);
        			ansList.set(i+1, country1);
        		}
        	}
        }
        return ansList;
    }

    // Lọc dữ liệu theo continent.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterContinent(String continent) {
    	List<AbstractCountry> ansList = new ArrayList<>();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getContinent().equals(continent)) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }
    
    // Lọc ra howMany nước đông dân nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	int max = sortDecreasingByPopulation().get(0).getPopulation();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getPopulation() == max) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }

    // Lọc ra howMany nước ít dân nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	int min = sortIncreasingByPopulation().get(0).getPopulation();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getPopulation() == min) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }

    // Lọc ra howMany nước có diện tích lớn nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	double max = sortDecreasingByArea().get(0).getArea();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getArea() == max) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }
    
    // Lọc ra howMany nước có diện tích nhỏ nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	double min = sortIncreasingByArea().get(0).getArea();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getArea() == min) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }

    // Lọc ra howMany nước có GDP cao nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	double max = sortDecreasingByGdp().get(0).getGdp();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getGdp() == max) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
    }

    // Lọc ra howMany nước có GDP thấp nhất.
    // Lưu và trả ra một list mới, không thay đổi list dữ liệu gốc.
    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
    	List<AbstractCountry> ansList = new ArrayList<>();
    	double min = sortIncreasingByGdp().get(0).getGdp();
        for (AbstractCountry abstractCountry : countryList) {
        	if (abstractCountry.getGdp() == min) {
        		ansList.add(abstractCountry);
        	}
        }
        
        return ansList;
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