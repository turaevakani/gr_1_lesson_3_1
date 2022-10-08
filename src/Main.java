import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] massive = {2, -5, 16, -62, -18, 74, 32, 85, 14, 36, 55, -41, -60, 25 };
        double average = 0.0;
        int count = 0;
        for(int i=0; i<massive.length; i++){
            if(massive[i]<0){
                for (int j = i+1; j <massive.length ; j++) {
                    if(massive[j]>0){
                        average += massive[j];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println(Arrays.toString(massive) + "=" + average/count);



        
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
