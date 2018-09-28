package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int j;
		int[] z = new int[100];
		int[] x = new int[100];
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
				(z[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= z[i];j++)
			{
				if (j == 1)
				{
					a = 1;
					x[i] = a;
				}
				if (j == 2)
				{
					b = 1;
					x[i] = b;
				}
				if (j > 2)
				{
					x[i] = a + b;
					a = b;
					b = x[i];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",x[i]);
		}
		return 0;
	}
}

