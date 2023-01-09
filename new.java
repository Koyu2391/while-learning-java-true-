public class new {
        public static int numberOfSteps(int num) {
            int i =0;
            while ( num < 0) {
                if ( num % 2 == 0) {
                    num = num/2;
                }
    
                else { 
                    num = (num - 1);
                }
                i++;
            }
            return i;
        }
    public static void main () {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter number ");
        int num = sc.nextInt();
    
        numberOfSteps(num);
    }
    }
    

