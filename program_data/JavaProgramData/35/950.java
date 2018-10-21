package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] suzu = new int[8][8];
		int i;
		int k;
		int m;
		int n;
		int[] a = new int[8];
		int[] b = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					suzu[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				a[i] = 0;
				if (suzu[i][k] > suzu[i][a[i]])
				{
					a[i] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < m;k++)
			{
				b[i] = 0;
				if (suzu[k][i] < suzu[b[i]][i])
				{
					b[i] = k;
				}
			}
		}
		for (i = 0;i < 8;i++)
		{
			for (k = 0;k < 8;k++)
			{
				if (a[i] == k && b[k] == i)
				{
					System.out.printf("%d+%d",k,i);
					return 0;
				}
			}
		}
		System.out.print("No");
		return 0;
	}


}

