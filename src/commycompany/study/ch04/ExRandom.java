package commycompany.study.ch04;


public class ExRandom {
    public static void main(String[] args) {
        
        // int min = 1;
        // int max = 45;
        // int random = (int)(Math.random()*(max - min)+min);

        // System.out.println("random : " + random);

        //make array of 6 random numbers and Not three consecutive numbers
        // int[] lotto = new int[6];
        // int count = 0;
        // while(count < lotto.length){
        //     random = (int)(Math.random()*(max - min)+min);
        //     boolean flag = true;
        //     for(int i = 0; i < count; i++){
        //         if(lotto[i] == random){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         lotto[count] = random;
        //         count++;
        //     }
        // }
        // //print array
        // for(int i = 0; i < lotto.length; i++){
        //     System.out.print(lotto[i] + " ");
        // }
        
        // make array of 2 random numbers and combine them
        int[] lotto = new int[2];
        int count = 0;
        while(count < lotto.length){
            int random = (int)(Math.random()*(45 - 1)+1);
            boolean flag = true;
            for(int i = 0; i < count; i++){
                if(lotto[i] == random){
                    flag = false;
                    break;
                }
            }
            if(flag){
                lotto[count] = random;
                count++;
            }
        }
        //print array
        for(int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
        //combine two numbers
        int lottoNum = lotto[0] + lotto[1];
        System.out.println("lottoNum : " + lottoNum);

 
    }
}
