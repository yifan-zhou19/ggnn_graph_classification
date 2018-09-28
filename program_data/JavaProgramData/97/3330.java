package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int f;
	 a = m / 100;
	 b = (m - 100 * a) / 50;
	 c = (m - 100 * a - 50 * b) / 20;
	 d = (m - a * 100 - 50 * b - 20 * c) / 10;
	 e = (m - a * 100 - 50 * b - 20 * c - 10 * d) / 5;
	 f = (m - a * 100 - 50 * b - 20 * c - 10 * d - e * 5) / 1;
	 System.out.printf("%d\n",a);
	 System.out.printf("%d\n",b);
	 System.out.printf("%d\n",c);
	 System.out.printf("%d\n",d);
	 System.out.printf("%d\n",e);
	 System.out.printf("%d\n",f);
		  return 0;
	}
}

