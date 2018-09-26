package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int r;
		int k = 0;
		int m;
		int n;
		int max;
		int s;
		int p = 0;
		int[][] a = new int[8][8];
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					k = j;
				}

			}
			s = 0;
			for (r = 0;r < m;r++)
			{
			   if (a[r][k] < max)
			   {
				   s++;
			   }
			}
			   if (s == 0)
			   {
				   System.out.printf("%d+%d\n",i,k);
			   }
			   else
			   {
				   p++;
			   }
		}
		if (p == m)
		{
			System.out.print("No");
		}
	}

}

