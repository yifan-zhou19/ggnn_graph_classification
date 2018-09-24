package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		a = num / 10000;
		b = num % 10000 / 1000;
		c = num % 1000 / 100;
		d = num % 100 / 10;
		e = num % 10;
		if (num / 10000 == 1)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (num / 1000 != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (num / 100 != 0)
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (num / 10 != 0)
		{
			System.out.printf("%d%d",e,d);
		}
		else
		{
			System.out.printf("%d",e);
		}
	}

}

