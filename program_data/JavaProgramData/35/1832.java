package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int b = 0;
		int[][] x = new int[10][10];
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
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int a;
		int p;
		int q;
		for (i = 0;i < m;i++)
		{
			b = 0;
			p = i;
			q = 0;
			for (j = 0;j < n;j++)
			{
				a = x[i][0];
				if (x[i][j] > a)
				{
					a = x[i][j];
					p = i;
					q = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (x[k][q] < a)
				{
					b = 1;
				}
			}
			if (b == 0)
			{
				System.out.printf("%d+%d",p,q);
				break;
			}
		}
				if (b == 1)
				{
				System.out.print("No");
				}
		return 0;
	}

}

