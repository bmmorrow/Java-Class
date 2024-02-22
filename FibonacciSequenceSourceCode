public class FibonacciSequence {
    public static void main(String[] args) throws Exception {
        int count = Integer.parseInt(args[0]);
        int a = 0;
        int b = 1;
        int c;
        //System.out.print(a +" "+ b);//printing 0 and 1  

        if (count == 1){
            System.out.print("0");
        } else if (count == 2){
            System.out.print("1");
        }
  
        for(int i = 3; i <= count; ++i){ //loop starts from 2 because 0 and 1 are already printed  
            c = a + b;
            if (i == count){
                System.out.print(c);
            } 
            a = b;  
            b = c;  
        }
    }
}
