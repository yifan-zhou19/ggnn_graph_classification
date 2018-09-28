package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int[] x = new int[300];
		int[] y = new int[300];
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				break;
			}
			else
			{
				int n = a;
				for (i = 0;i < n;i++)
				{
					x[i] = i + 1;
				}
				do
				{
					j = b % n;
					for (i = 0;i < n - 1;i++)
					{
						y[i] = x[(j + i) % n];
					}
					for (i = 0;i < n - 1;i++)
					{
						x[i] = y[i];
					}
					n = n - 1;
				} while (n > 1);
				System.out.printf("%d\n",x[0]);
			}
		}
		return 0;
	}
}

