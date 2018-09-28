package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int z;
		int y;
		int[] x = new int[50001];
		int[] d = new int[50001];
		int[] j = new int[50001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d[i] = Integer.parseInt(tempVar3);
			}
		}
		y = 0;
		z = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (x[i] < x[y])
			{
				y = i;
			}
			if (d[i] > d[z])
			{
				z = i;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (k = x[i] + 1;k <= d[i];k++)
			{
				j[k] = 1;
			}
		}
		for (k = 1,i = x[y] + 1;i <= d[z];i++)
		{
			if (j[i] == 1)
			{
				k++;
			}
			else
			{
				System.out.print("no");
				break;
			}
		}
		if (k == d[z] - x[y] + 1)
		{
			System.out.printf("%d %d",x[y],d[z]);
		}
		return 0;
	}

}

