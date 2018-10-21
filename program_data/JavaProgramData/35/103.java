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
		int[] m = new int[8];
		int[] n = new int[8];
		int f = 0;
		int s;
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
					if (s < a[k][l])
					{
						s = a[k][l];
						m[k] = l;
					}
				}
			}
			for (l = 0;l < j;l++)
			{
				for (s = 10000,k = 0;k < i;k++)
				{
					if (s > a[k][l])
					{
						s = a[k][l];
						n[l] = k;
					}
				}
			}
			for (k = 0;k < i;k++)
			{
				if (n[m[k]] == k)
				{
				System.out.printf("%d+%d",k,m[k]);
				f = 1;
				break;
				}
			}
				if (f == 0)
				{
					System.out.print("No");
				}

	}
}

