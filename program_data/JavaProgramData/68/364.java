package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= k;i += 2)
		{
			for (j = 3;2 * j <= k;j += 2)
			{
				if (su(j) == 1 && su(i - j) == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}
	public static int su(int x)
	{
		int i;
		int j = 1;
		int k = x;
		if (k % 2 == 0)
		{
			j = 0;
		}
		else
		{
			for (i = 3;i * i <= k;i += 2)
			{
				if (k % i == 0)
				{
					j = 0;
				}
			}
		}
		return j;
	}
}

