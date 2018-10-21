package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int[] c = new int[8];
		int[] b = new int[8];
		int opp;
		int num;
		int m;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][0] = Integer.parseInt(tempVar3);
			}
			c[i] = a[i][0];
			b[i] = 0;
			for (j = 1;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
				if (a[i][j] > c[i])
				{
					c[i] = a[i][j];
					b[i] = j;
				}
			}
		}
		if ((n == 1) || (m == 1))
		{
			System.out.print("No");
		}
		else
		{
		opp = 1;
		num = 0;
		for (i = 0;i < m;i++)
		{
			k = b[i];
			for (j = 0;j < m;j++)
			{
				if (c[i] > a[j][k])
				{
					opp = 0;
					break;
				}
			}
			if (opp == 1)
			{
				System.out.printf("%d+%d",i,k);
			num = num + 1;
			}
		}
		if (num == 0)
		{
			System.out.print("No");
		}
		}
		return 0;
	}
}

