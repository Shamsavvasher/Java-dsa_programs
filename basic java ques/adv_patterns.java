public class adv_patterns{
    public static void howllow_reactangel(int totrow, int totcol){
        for(int i=1; i<=totrow; i++){
            for(int j=1; j<=totcol; j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
             System.out.println();
        }
       
    }
    public static void inverted_half_paramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                 System.out.println();
        }
        System.out.println();
        
    }

      public static void inverted_half_paramid_withNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
      }

      public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
      }
      public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) %2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }   
            }
            System.out.println();
        }
      }
      public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
              System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
              System.out.println();
        }
      
      
      }

    public static void solid_rohmbus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rohmbus(int n){
       for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print(".");
            }
            System.out.println();
        }
    
    //2nd half
    
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void paramid_withNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    //     howllow_reactangel(5,5);
    //     inverted_half_paramid(4);
    //    inverted_half_paramid_withNumbers(6);
    //     floyds_triangle(7);
    //     zero_one_triangle(5);
    //     butterfly(6  );
    //     solid_rohmbus(7);
    // hollow_rohmbus(5);
    // diamond(20);
    paramid_withNumber(4);
    }
}
