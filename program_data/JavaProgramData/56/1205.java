package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m = 0;
	 int a = 0;
	 int s = 0;
	 int d = 0;
	 int f = 0;
	 int g = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (1 <= n != 0 && n <= 9)
	 {
		 s = 0,d = 0,f = 0,g = 0;
		 a = n;
		 m = 10000 * g + 1000 * f + 100 * d + 10 * s + a;
	 }
	 if (10 <= n != 0 && n <= 99)
	 {
		 d = f = g = 0;
		 a = n / 10;
		 s = n % 10;
		 m = 10000 * g + 1000 * f + 100 * d + 10 * s + a;
	 }
	 if (100 <= n != 0 && n <= 999)
	 {
		 f = g = 0;
		 a = n / 100;
		 s = n % 100 / 10;
		 d = n % 100 % 10 % 10;
		 m = 10000 * g + 1000 * f + 100 * d + 10 * s + a;
	 }
		 if (1000 <= n != 0 && n <= 9999)
		 {
		 g = 0;
		 a = n / 1000;
		 s = n % 1000 / 100;
		 d = n % 1000 % 100 / 10;
		 f = n % 1000 % 100 % 100 % 10;
		 m = 10000 * g + 1000 * f + 100 * d + 10 * s + a;
		 }
		 if (10000 <= n != 0 && n <= 99999)
		 {
		 a = n / 10000;
		 s = n % 10000 / 1000;
		 d = n % 10000 % 1000 / 100;
		 f = n % 10000 % 1000 % 100 / 10;
		 g = n % 10000 % 1000 % 100 % 10;
		 m = 10000 * g + 1000 * f + 100 * d + 10 * s + a;
		 }
		 System.out.printf("%d\n",m);
	 return 0;
	}




}

