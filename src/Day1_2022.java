import java.io.BufferedReader;

public class Day1_2022 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new java.io.FileReader("src\\input"));

        int cals = 0;
        int mostCals = 0;
        String line;

            while ((line = br.readLine()) != null) {
            String strCal = line.trim();
            if (strCal.isBlank()) {
                if (mostCals < cals) {
                    mostCals = cals;
                }
                cals = 0;
                continue;
            }
        cals += Integer.parseInt(strCal);
        }
        System.out.println(mostCals);
    }

}
