package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[8];
		int[][] sz = new int[8][8];
		int b;
		int max;
		int c = 0;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max = sz[i][0];
			a[i] = 0;
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					a[i] = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (b = 0;b < n;b++)
			{
				if (sz[i][a[i]] > sz[b][a[i]])
				{
					c = 0;
					break;
				}
				else
				{
					c = 1;
					h = i;
					l = a[i];

				}
			}
			if (c == 1)
			{
				break;
			}
		}
		if (c == 1)
		{
			System.out.printf("%d+%d",h,l);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}




}

