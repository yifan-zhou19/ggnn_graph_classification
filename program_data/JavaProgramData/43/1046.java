package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int i;
		int n;
		int flag1 = 0;
		int flag2 = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n;i++)
		{
			flag1 = flag2 = 0;
			for (m = 2;m < i;m++)
			{
				if (i % m != 0)
				{
					flag1++;
				}
			}
			if (flag1 != i - 2)
			{
				continue;
			}
			j = n - i;
			for (k = 2;k < j;k++)
			{
				if (j % k != 0)
				{
					flag2++;
				}
			}
			if (flag2 != j - 2)
			{
				continue;
			}
			if (i <= j)
			{
				System.out.printf("%d %d\n\n",i,j);
			}
		}
		return 0;
	}
}

