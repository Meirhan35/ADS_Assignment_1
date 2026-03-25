int f(int n,int a, int b){
    if(n > 0){
        int cur = a;
        a = b;
        b += cur;
        return f(n - 1, a, b);
    }
    return b;
}
void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(f(n - 1, 0, 1));
}