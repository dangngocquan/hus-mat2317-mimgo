package lastTerm.Y20212022.Code01.exercise03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static CountryArrayManager countryArrayManager = new CountryArrayManager();
    
    public static void main(String[] args) {
        init();
        System.out.println("Length = " + countryArrayManager.getLength());
        for (int i = 0; i < countryArrayManager.getLength(); i++) {
        	System.out.println(countryArrayManager.getCountryDataArray()[i].toString());
        }
    }
    
    public static void init() {
        String filePath ="D:\\Study\\Java\\WithEclipse\\MIMGOMAT2317\\src\\lastTerm\\Y20212022\\Code01\\exercise03\\countries1.csv";
        readArrayData(filePath);
    }
    
    

    public static void readArrayData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData(dataList.get(0),
                        dataList.get(1),
                        Integer.parseInt(dataList.get(2)),
                        Double.parseDouble(dataList.get(3)),
                        Double.parseDouble(dataList.get(4)),
                        dataList.get(5));
                countryArrayManager.append(newCountryData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<String>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }
}