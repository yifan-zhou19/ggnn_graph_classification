package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int c1;
		int c2;
		int c3;
		int c4;
		int c5;
		int d1;
		int d2;
		int d3;
		int d4;
		int d5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		c1 = a / 10000;
		d1 = a % 10000;
		c2 = d1 / 1000;
		d2 = d1 % 1000;
		c3 = d2 / 100;
		d3 = d2 % 100;
		c4 = d3 / 10;
		d4 = d3 % 10;
		c5 = d4;
		if (c5 != 0)
		{
			System.out.printf("%d",c5);
		}
		if (c4 != 0)
		{
			System.out.printf("%d",c4);
		}
		if (c3 != 0)
		{
			System.out.printf("%d",c3);
		}
		if (c2 != 0)
		{
			System.out.printf("%d",c2);
		}
		if (c1 != 0)
		{
			System.out.printf("%d",c1);
		}
	}


}

