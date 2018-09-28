package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int[] c = new int[8];
		int i;
		int j;
		int m;
		int n;
		int k;
		int l = 0;
		int s;
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
			b[i] = a[i][0];
			c[i] = 0;
			k = 1;
			for (j = 0;j < n;j++)
			{
				if (b[i] < a[i][j])
				{
					b[i] = a[i][j];
					c[i] = j;
				}
			}
			s = c[i];
			for (j = 0;j < m;j++)
			{
				if (b[i] < a[j][s])
				{
					k++;
				}
			}
				if (k == m)
				{
					System.out.printf("%d+%d",i,c[i]);
					l++;
				}
		}
		if (l == 0)
		{
		System.out.print("No");
		}
	}
}

