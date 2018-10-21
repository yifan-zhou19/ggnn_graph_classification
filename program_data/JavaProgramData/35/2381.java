package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int k;
		int[][] sz = new int[8][8];
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
		d = 0;
		for (i = 0;i < n;i++)
		{
			a = b = c = 0;
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] > a)
				{
					a = sz[i][j];
					b = j;
				}
			}
			e = a;
			for (k = 0;k < n;k++)
			{
				if (sz[k][b] < a)
				{
					a = sz[k][b];
				}
			}
			if (a == e)
			{
				System.out.printf("%d+%d",i,b);
				d = 1;
				break;
			}
		}
		if (d != 1)
		{
			System.out.print("No");
		}
		return 0;
	}




}

