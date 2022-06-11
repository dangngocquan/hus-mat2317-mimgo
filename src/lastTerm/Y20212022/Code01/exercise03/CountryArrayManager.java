package lastTerm.Y20212022.Code01.exercise03;

import java.util.*;

public class CountryArrayManager {
    private CountryData[] countryDataArray; // Dữ liệu của các nước
    private int length; // Độ dài mảng có dữ liệu, những index lớn hơn hoặc bằng length là null
    private int increment; // Mỗi lần thêm dữ liệu, nếu không đủ chỗ thì cấp phát thêm increment phần tử cho mảng

    // Hàm dựng
    // increment là lượng mỗi lần cấp phát thêm, mặc định bằng 10
    // Khi chưa có dữ liệu, length = 0
    public CountryArrayManager() {
        this.increment = 10;
        countryDataArray = new CountryData[this.increment];
        this.length = 0;
    }

    // Hàm dựng
    // Cấp phát cho mảng capacity phần tử
    // Mảng chưa có dữ liệu nên length = 0
    public CountryArrayManager(int capacity) {
        countryDataArray = new CountryData[capacity];
        this.length = 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public CountryData[] getCountryDataArray() {
        return this.countryDataArray;
    }

    // Hàm correct dùng để chuẩn hóa dữ liệu lưu trong mảng
    // Khi mảng có phần tử là null thì tất cả những phần tử sau đó phải là null
    // Mảng chỉ chứa dữ liệu từ chỉ số 0 đến chỉ số length - 1
    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countryDataArray.length; i++) {
            if (this.countryDataArray[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countryDataArray.length; i++) {
                this.countryDataArray[i] = null;
            }
        }
    }

    // Hàm dùng để cấp phát thêm phần tử cho mảng khi cần thiết.
    // Giả sử khi muốn thêm phần tử vào mảng, nhưng mảng đã hết chỗ, nên cần phải cấp phát thêm phần tử cho mảng.
    // Vì mảng có độ dài cố định, nên cần phải cấp phát lại mảng khác có độ dài lớn hơn, sau đó copy dữ liệu ở mảng cũ sang mảng mới.
    private void allocateMore() {
        CountryData[] newArray = new CountryData[this.length + this.increment];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.countryDataArray.length);
        this.countryDataArray = newArray;
    }

    // Thêm dữ liệu vào vị trí cuối.
    // Vì Manager quản lý mảng chỉ có length phần tử chứa dữ liệu, phần còn lại là null, nên vị trí thêm vào chính là vị trí có chỉ số length.
    // Trước khi thêm cần phải kiểm tra xem mảng có còn chỗ để thêm hay không.
    // Nếu còn thì thêm vào ở vị trí length, nếu không còn thì phải cấp phát thêm phần tử cho mảng bằng cách gọi hàm allocateMore(),
    // sau đó thêm dữ liệu vào, tăng length lên 1 đơn vị.
    public void append(CountryData countryData) {
        correct();
        if (this.length < countryDataArray.length) {
        	countryDataArray[this.length] = countryData;
        	this.length += 1;
        }else {
        	allocateMore();
        	countryDataArray[this.length] = countryData;
        	this.length += 1;
        }
    }

    // Thêm dữ liệu vào vị trí index.
    // Trước khi thêm cần phải kiểm tra xem mảng có còn chỗ để thêm hay không.
    // Nếu còn thì thêm dữ liệu vào ở vị trí index, nếu không còn thì phải cấp phát thêm phần tử cho mảng bằng cách gọi hàm allocateMore(),
    // sau đó thêm dữ liệu vào, tăng length lên 1 đơn vị.
    // Vì cấu trúc mảng sau khi được cấp phát là cố định, nên thêm phần tử vào vị trí index có nghĩa là dịch chuyển dữ liệu sau vị trí index sang 
    // phải 1 đơn vị, sau đó đặt dữ liệu mới vào vị trí index.
    public void addCountry(CountryData countryData, int index) {
        correct();
        if (this.length < countryDataArray.length) {
        	for (int i = countryDataArray.length - 1; i >= index; i--) {
        		countryDataArray[i+1] = countryDataArray[i];
        	}
        	countryDataArray[index] = countryData;
        }else {
        	allocateMore();
        	correct();
        	for (int i = countryDataArray.length - 1; i >= index; i--) {
        		countryDataArray[i+1] = countryDataArray[i];
        	}
        	countryDataArray[index] = countryData;
        }
        this.length += 1;
    }


    // Xóa dữ liệu ở vị trí index.
    // Vì cấu trúc mảng sau khi cấp phát là cố định, nên xóa phần tử ở vị trí index có nghĩa là dịch chuyển những dữ liệu sau vị trí index 
    // sang trái 1 đơn vị, gán cho dữ liệu ở vị trí length bằng null, độ dài length giảm đi 1 đơn vị.
    public void removeCountry(int index) {
        for (int i = index; i < countryDataArray.length - 1; i++) {
        	countryDataArray[i] = countryDataArray[i+1];
        }
        countryDataArray[countryDataArray.length-1] = null;
        this.length--;
    }

    // Lấy dữ liệu ở vị trí index
    public CountryData countryDataAt(int index) {
        return countryDataArray[index];
    }

    // Sắp xếp dữ liệu theo thứ tự dân số (population) tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortIncreasingByPopulation() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getPopulation() > ansArray[i+1].getPopulation()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }
    
    // Sắp xếp dữ liệu theo thứ tự dân số (population) giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortDecreasingByPopulation() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getPopulation() < ansArray[i+1].getPopulation()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }

    // Sắp xếp dữ liệu theo thứ tự diện tích (area) tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortIncreasingByArea() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getArea() > ansArray[i+1].getArea()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }

    // Sắp xếp dữ liệu theo thứ tự diện tích (area) giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortDecreasingByArea() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getArea() < ansArray[i+1].getArea()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }

    // Sắp xếp dữ liệu theo thứ tự gdp tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortIncreasingByGdp() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getGdp() > ansArray[i+1].getGdp()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }

    // Sắp xếp dữ liệu theo thứ tự gdp giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort.
    public CountryData[] sortDecreasingByGdp() {
    	correct();
        CountryData[] ansArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
        	ansArray[i] = countryDataArray[i];
        }
        
        for (int turn = 1; turn <= this.length; turn++) {
        	for (int i = 0; i < this.length - 1; i++) {
        		if (ansArray[i].getGdp() < ansArray[i+1].getGdp()) {
        			CountryData temp = ansArray[i];
        			ansArray[i] = ansArray[i+1];
        			ansArray[i+1] = temp;
        		}
        	}
        }
        
        return ansArray;
    }

    // Lọc ra những nước ở vùng continent (ví dụ, Châu Á).
    // Duyện từ đầu mảng đến cuối mảng, xác định xem có bao nhiêu nước thuộc vùng continent,
    // cấp phát một mảng đủ để chứa dữ liệu, sau đó duyệt lại qua mảng để thêm những nước trong vùng continent 
    // vào mảng mới vừa cấp phát. (Có thể làm theo cách khác).
    public CountryData[] filterContinent(String continent) {
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getContinent().equals(continent)) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getContinent().equals(continent)) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        
        return ansArray;
    }

    // Lọc ra những nước (howMany nước) có dân số đông nhất
    // Có thể làm như sau.
    // Sắp xếp dữ liệu theo thứ tự dân số giảm dần. Cấp phát mảng mới có howMany phần tử,
    // copy howMany dữ liệu từ mảng đã sắp xếp vào mảng mới vừa cấp phát.
    // Trả ra mảng mới vừa copy.
    public CountryData[] filterMostPopulousCountries(int howMany) {
        int maxPopulation = sortDecreasingByPopulation()[0].getPopulation();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getPopulation() == maxPopulation) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getPopulation() == maxPopulation) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Lọc ra howMany nước có dân số ít nhất.
    public CountryData[] filterLeastPopulousCountries(int howMany) {
    	int minPopulation = sortIncreasingByPopulation()[0].getPopulation();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getPopulation() == minPopulation) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getPopulation() == minPopulation) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Lọc ra howMany nước có diện tích lớn nhất.
    public CountryData[] filterLargestAreaCountries(int howMany) {
    	double maxArea = sortDecreasingByArea()[0].getArea();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getArea() == maxArea) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getArea() == maxArea) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Lọc ra howMany nước có diện tích nhỏ nhất.
    public CountryData[] filterSmallestAreaCountries(int howMany) {
    	double minArea = sortIncreasingByArea()[0].getArea();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getArea() == minArea) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getArea() == minArea) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Lọc ra howMany nước có GDP cao nhất.
    public CountryData[] filterHighestGdpCountries(int howMany) {
    	double maxGPD = sortDecreasingByGdp()[0].getArea();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getGdp() == maxGPD) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getGdp() == maxGPD) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Lọc ra howMany nước có GDP thấp nhất.
    public CountryData[] filterLowestGdpCountries(int howMany) {
    	double minGPD = sortIncreasingByGdp()[0].getArea();
        int count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getGdp() == minGPD) {
        		count++;
        	}
        }
        
        CountryData[] ansArray = new CountryData[count];
        count = 0;
        for (CountryData country : countryDataArray) {
        	if (country != null && country.getGdp() == minGPD) {
        		ansArray[count] = country;
        		count++;
        	}
        }
        return ansArray;
    }

    // Hàm lấy danh sách các nước theo code, là String có format dạng, ví dụ [USA VNM].
    public static String codeOfCountriesToString(CountryData[] countryDataArray, int length) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < length; i++) {
            CountryData countryData = countryDataArray[i];
            codeOfCountries.append(countryData.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    // In đầy đủ thông tin các nước trong một mảng, mỗi mảng in trên 1 dòng.
    // Ví dụ:
    // [CountryData[code='IND', name='India', population=1405888536, area=3287590.0, gdp=1927.7, continent='Asia']
    //  CountryData[code='PAK', name='Pakistan', population=229248330, area=881912.0, gdp=1188.9, continent='Asia']]
    public static void print(CountryData[] countryDataArray, int length) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < length; i++) {
            CountryData country = countryDataArray[i];
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}