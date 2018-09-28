package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int max1;
		int max2;
		int i;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
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
		if (b > c)
		{
			max1 = b,max2 = c;
		}
		else if (b < c)
		{
			max1 = c,max2 = b;
		}
		else
		{
			max1 = max2 = b = c;
		}

		for (i = 1;i <= count - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (a > max1)
			{
				max2 = max1;
				max1 = a;
			}
			else if (max2 < a && a < max1)
			{
				max2 = a;
			}
			else
			{
				max1 = max1;
				max2 = max2;
			}
		}
		System.out.printf("%d\n%d",max1,max2);
		return 0;
	}
}

