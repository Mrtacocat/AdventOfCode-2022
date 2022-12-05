import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Day2_2022 {

    public static void main(String[] args) throws Exception{
        int score = 0;
        int endScore = 0;

        File file = new File("src\\input_day2");
        List<String> lines = Files.readAllLines(file.toPath());


        for (String line : lines) {
            switch (line) {
                case "A X" -> {
                    score += 4; // 1+3=4
                    endScore += 3; // 0+3=3
                }
                case "A Y" -> {
                    score += 8; // 2+6=8
                    endScore += 4; // 1+3=4
                }
                case "A Z" -> {
                    score += 3; // 3+0=3
                    endScore += 8; // 2+6=8
                }
                case "B X" -> {
                    score += 1; // 1+0=1
                    endScore += 1; // 1+0=1
                }
                case "B Y" -> {
                    score += 5; // 2+3=5
                    endScore += 5; // 2+3=5
                }
                case "B Z" -> {
                    score += 9; // 3+6=9
                    endScore += 9; // 3+6=9
                }
                case "C X" -> {
                    score += 7; // 1+6=7
                    endScore += 2; // 2+0=2
                }
                case "C Y" -> {
                    score += 2; // 2+0=2
                    endScore += 6; // 2+4=6
                }
                case "C Z" -> {
                    score += 6; // 3+3=6
                    endScore += 7; // 1+6=7
                }
            }
        }
        System.out.println(score);
        System.out.println(endScore);



    }
}
