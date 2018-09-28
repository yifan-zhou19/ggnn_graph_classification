package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int[][] c = new int[8][8];
		int i;
		int j;
		int k;
		int p;
		int q;
		int t;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		t = 0;
		for (i = 0;i < a;i++)
		{

			for (j = 0;j < b;j++)
			{
				p = 0;
				q = 0;
				for (k = 0;k < b;k++)
				{
					if (c[i][j] < c[i][k])
					{
						p++;
					}
				}
				for (k = 0;k < a;k++)
				{
					if (c[k][j] < c[i][j])
					{
						q++;
					}
				}
				if (p == 0 && q == 0)
				{
					System.out.printf("%d+%d",i,j);
					t++;
				}
			}

		}
		if (t == 0)
		{
			System.out.print("No");
		}

	}
}

