package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m1;
	int m2;
	int a = 1;
	int b = 0;
	int c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (a <= n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m2 = Integer.parseInt(tempVar3);
		}
		if (m1 >= 90 && m1 <= 140 && m2 >= 60 && m2 <= 90)
		{
			b = b + 1;
		}
		else
		{
			if (b >= c)
			{
				c = b;
			}
				b = 0;
		}
		a = a + 1;
	}
	if (b >= c)
	{
		c = b;
	}
	   System.out.printf("%d",c);
	   return 0;
	}
}

