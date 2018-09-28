package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
		a = (int)n / 100;
		 b = (int)(n - a * 100) / 50;
		 c = (int)(n - a * 100 - b * 50) / 20;
		 d = (int)(n - a * 100 - b * 50 - c * 20) / 10;
		 e = (int)(n - a * 100 - b * 50 - c * 20 - d * 10) / 5;
		 f = n - a * 100 - b * 50 - c * 20 - d * 10 - e * 5;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
	System.out.printf("%d\n",c);
	System.out.printf("%d\n",d);
	System.out.printf("%d\n",e);
	System.out.printf("%d\n",f);
	}
}

