package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] c = new int[100];
		n = 0;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < 2;j++)
		{
			for (i = n - 1;i > j;i--)
			{
				if (c[i - 1] < c[i])
				{
					k = c[i - 1];
					c[i - 1] = c[i];
					c[i] = k;
				}
			}
		}
		for (j = 0;j < 2;j++)
		{
			System.out.printf("%d\n",c[j]);
		}
	}
}

