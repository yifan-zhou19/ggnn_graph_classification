package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int prime = int;
		int x;
		int y;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (t = 6;t <= x;t++,t++)
		{
		for (i = 3;i <= t / 2;i++,i++)
		{
		int flag1 = 1;
		int j;
		for (j = 3;j <= Math.sqrt(i) && flag1 == 1;j++, j++)
		{
			if (i % j == 0)
			{
				flag1 = 0;
			}
		}
		if (flag1 != 0)
		{
				y = t - i;
		}
		int flag2 = 1;
		int k;
		for (k = 3;k <= Math.sqrt(y) && flag2 == 1;k++, k++)
		{
		if (y % k == 0)
		{
		flag2 = 0;
		}
		}
		if (flag2 != 0)
		{
			System.out.printf("%ld=%ld+%ld\n",t,i,y);
			break;
		}
		}
		}
	}
}

