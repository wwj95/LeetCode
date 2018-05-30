public class ReverseInteger {
    public static int reverse(int x) {
        int res,f;
        int ff =0;

        while(x/10!=0) {
            res = x%10;
            x = x/10;
            ff = ff*10+res;
        }
        if (Integer.MAX_VALUE / 10 < Math.abs(ff)) {
            return 0;
        }
        return ff*10+ x%10;
    }
    public static void main(String[] args) {
        System.out.print(reverse(1534236469));
    }

}

