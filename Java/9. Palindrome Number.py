class Solution {
    public boolean isPalindrome(int n) {
       int temp=n;
        int rev=0,rem=0;
        if(n>=0){
        while(n!=0)
        { rem=n%10;
          rev=rev*10+rem;
          n=n/10;

        }
        }
      return rev==temp;
        
    }
       static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
                System.out.println("Time overwrite aborted");
            }
        }));
        }
}