public class LMN {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int lmn(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
