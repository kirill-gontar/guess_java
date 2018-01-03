package game;

import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        String list = "abcdefghijklmnopqrstuvwxyz";
        int proposed_num = Game.getRandom(0, 25);

        Scanner input = new Scanner(System.in);
        String letter;
        int num;
        
        while(true){
            letter = input.nextLine();
            if(letter.length() != 1){
                System.out.println("Нет!");
                continue;
            }
            letter = letter.toLowerCase();
            num = list.indexOf(letter);
            if(num < 0 || num > 25){
                System.out.println("Нет!");
                continue;
            }
            if(num == proposed_num){
                 System.out.println("Угадали!");
                 break;
            }
            if(num > proposed_num) System.out.println("Берите ниже!");
            if(num < proposed_num) System.out.println("Берите выше!");
        }
    }
    
    /**
     * Генерация случайного число (включая пределы)
     * @param min Минимальное значение
     * @param max Максимальное значение
     * @return Сгенерированое случайное число
     */
    private static int getRandom(int min, int max){
        max -= min;
        return min + (int)(Math.random() * (max + 1));
    }
    
}
