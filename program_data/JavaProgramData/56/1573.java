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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 9999)
		{
			a = n / 10000,b = (n - a * 10000) / 1000,c = (n - a * 10000 - b * 1000) / 100,d = (n - a * 10000 - b * 1000 - c * 100) / 10,e = (n - a * 10000 - b * 1000 - c * 100 - d * 10);
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (n > 999)
		{
				a = n / 1000,b = (n - a * 1000) / 100,c = (n - a * 1000 - b * 100) / 10,d = (n - a * 1000 - b * 100 - c * 10);
				System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else if (n > 99)
		{
				a = n / 100,b = (n - a * 100) / 10,c = (n - a * 100 - b * 10);
				System.out.printf("%d%d%d",c,b,a);
		}
		else if (n > 9)
		{
			a = n / 10,b = (n - a * 100);
			System.out.printf("%d%d",b,a);
		}
		else
		{
			System.out.printf("%d",n);
		}
	}


}

