import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] massive = {2.22, -5.445, 16.778, -62.3, -18.74, 74.454, 32.21, 85.44, 14.01, 36.12, 55.74, -41.2, -60.3, 25.25 };
        boolean a = false;
        double sumOfmassive = 0;
        int indexOfElements = 0;
        for(double elementsOfMassive : massive){
            if(elementsOfMassive<0){
                a=true;
            }
            if(elementsOfMassive>0 && a){
                System.out.println(elementsOfMassive);
                sumOfmassive +=elementsOfMassive;
                indexOfElements++;
            }
        }
        System.out.println(sumOfmassive + "/" + indexOfElements +  "=" + sumOfmassive/indexOfElements);





        System.out.println("***********************");
        System.out.println(Arrays.toString(massive));
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i+1]) {
                    temp = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("***********************");
        System.out.println(Arrays.toString(massive));

    }



}
