public class Star_Pattern {
    public static void main(String[] args) {
        // square stare
        int i,j,n=6;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
               if (i==0 || j==0 || i==n-1 || j==n-1){
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        trianglePattern(n);
    }

    public static void trianglePattern(int n) {
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        rightAngleTriangle(n);
    }
    public static void rightAngleTriangle(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        ReverseRightAngleTriangle(n);
    }
    public static void ReverseRightAngleTriangle (int n){
        int i,j;
        for (i=n;i>=1;i-- ){
            for (j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
