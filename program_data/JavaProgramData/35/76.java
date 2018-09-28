package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int l;
		int s = 0;
		int[] m = new int[8];
		int[] n = new int[8];
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < i;k++)
		{
			for (l = 0;l < j;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k][l] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < i;k++)
		{
			for (s = l = 0;l < j;l++)
			{
				if (s <= a[k][l])
				{
					s = a[k][l];
					m[k] = l;
				}
			}
		}
		for (k = 0;k < j;k++)
		{
			for (s = 10000,l = 0;l < i;l++)
			{
				if (s >= a[l][k])
				{
					s = a[l][k];
					n[k] = l;
				}
			}
		}
		for (k = 0;k < i;k++)
		{
			if (n[m[k]] == k)
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
		{
			System.out.printf("%d+%d\n",k,m[k]);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

