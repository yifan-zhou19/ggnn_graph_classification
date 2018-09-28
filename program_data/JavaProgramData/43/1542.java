package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= x / 2;i += 2)
		{
			l = 0;
			j = x - i;
			for (k = 2;k <= i - 1;k++)
			{
				l = l + !(i % k);
			}
			for (k = 2;k < j;k++)
			{
				l += !(j % k);
			}
			if (l == 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}




	}
}

