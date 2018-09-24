package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n % 10;
		y = (n % 100 - n % 10) / 10;
		z = (n % 1000 - n % 100) / 100;
		m = n / 1000;
		if (n < 10)
		{
		System.out.printf("%d",n);
		}
		else if (n == 10)
		{
		System.out.print("01");
		}
		else if (n == 100)
		{
		System.out.print("001");
		}
		else if (n == 1000)
		{
		System.out.print("0001");
		}
		else if (n == 10000)
		{
		System.out.print("00001");
		}
		else if (n > 10 && n < 100)
		{
		System.out.printf("%d%d",x,y);
		}
		else if (n > 100 && n < 1000)
		{
		System.out.printf("%d%d%d",x,y,z);
		}
		else if (n > 1000 && n < 10000)
		{
		System.out.printf("%d%d%d%d",x,y,z,m);
		}
		return 0;
	}
}

