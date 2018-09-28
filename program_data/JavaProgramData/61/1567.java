package <missing>;

public class GlobalMembers
{
	public static int s(int n)
	{
		int x;
		int y;
		int z;
		int i;
		x = 1;
		y = 1;
		z = x + y;
		for (i = 3;i < n;i++)
		{
			x = y;
			y = z;
			z = x + y;
		}
		if (n < 3)
		{
			z = 1;
		}
		return z;
	}
	public static int Main()
	{
		int[] n = new int[1000];
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%d\n",s(n[j]));
		}
		return 0;
	}

}

