package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 1;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (c > b)
		{
			c = c + b;
			b = c - b;
			c = c - b;
		}
		while (m <= n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (a > b)
			{
				a = a + b;
				b = a - b;
				a = a - b;
			}
			else if (a > c)
			{
				a = a + c;
				c = a - c;
				a = a - c;
			}
			m++;
		}
		System.out.printf("%d\n%d",b,c);
	}
}

