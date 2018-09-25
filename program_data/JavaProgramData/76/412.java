package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] z = new int[50000][2];
		int x;
		int y;
		int i;
		int j;
		int q;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (z[i][0] > z[j][0])
				{
					q = z[i][0];
					w = z[i][1];
					z[i][0] = z[j][0];
					z[i][1] = z[j][1];
					z[j][0] = q;
					z[j][1] = w;
				}
			}
		}
		q = z[0][1];
		for (i = 1;i < n;i++)
		{
			if (q < z[i][1])
			{
				q = z[i][1];
			}
		}
		x = z[0][0];
		y = z[0][1];
		for (i = 1;i < n;i++)
		{
			if (z[i][0] <= y != 0 && z[i][1] >= y)
			{
				y = z[i][1];

			}

		}
		if (y == q)
		{

			System.out.printf("%d %d",x,y);
		}
		else
		{
			System.out.print("no");
		}
		return 0;

	}


}

