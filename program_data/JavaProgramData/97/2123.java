package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 a = n / 100;
	 b = (n - 100 * a) / 50;
	 c = (n - 100 * a - 50 * b) / 20;
	 d = (n - 100 * a - 50 * b - 20 * c) / 10;
	 e = (n - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
	 f = n % 10 - 5 * e;
	 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	}
}

