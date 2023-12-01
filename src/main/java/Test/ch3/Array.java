package Test.ch3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Array {
    public static void main(String[] args){
        System.out.println("# 1. Declare and initialize an array");
        int[] scores = {95,100,87,91};
        scores[2] = 90;

        System.out.println(scores); // object id 출력
        for(int i  = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

        System.out.println("\n # 2. Array method: toString(), asList()");
        String[] cars = {"hyundai", "bmw", "benz", "toyota"};
        List<String> car_list = Arrays.asList(cars);
        System.out.println(car_list);// arratlist는 objectid가 아닌 내용으로 출력
        System.out.println(car_list.get(1));

        System.out.println("\n# 3. Arrays method: sort(array, Comparator), sort(arr)");
        Arrays.sort(cars);
        System.out.println(Arrays.asList(cars));

        Arrays.sort(cars, Collections.reverseOrder());
        System.out.println(Arrays.asList(cars));

        Arrays.sort(cars, 0, 2);
        System.out.println(Arrays.asList(cars));

        System.out.println("\n# 4. Arrays method: copyOf, copyOfRange");
        String[] cars_copied1 = Arrays.copyOf(cars, cars.length);
        System.out.println(Arrays.asList(cars_copied1));

        String[] cars_copied2 = Arrays.copyOfRange(cars, 0, 2);
        System.out.println(Arrays.asList(cars_copied2));

        System.out.println("\n #5. multiple array");
        int[][] allScores = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println(allScores[0][1]);
    }
}
