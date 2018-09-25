package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int f;
	 int g;
	 a <= 1000;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 b = a / 100;
	 c = (a % 100) / 50;
	 d = ((a % 100) - c * 50) / 20;
	 e = ((a % 100) - c * 50 - 20 * d) / 10;
	 f = (a % 10) / 5;
	 g = ((a % 10) - f * 5) / 1;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);
	return 0;
	}
}

