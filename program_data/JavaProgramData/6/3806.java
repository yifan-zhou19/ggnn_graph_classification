package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int t;
		for (t = 0;t < n;t++)
		{
		int h;
		int l;
		int sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		int[][] a = new int[100][100];
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}

		if (h == 1)
		{
			for (i = 0;i < l;i++)
			{
			sum = sum + a[0][i];
			}
		}
		else
		{
			if (l == 1)
			{
				for (j = 0;j < h;j++)
				{
					sum = sum + a[j][0];
				}
			}
			else
			{


		for (i = 0;i < l;i++)
		{
			sum = sum + a[0][i] + a[h - 1][i];
		}
		for (j = 1;j < h - 1;j++)
		{
			sum = sum + a[j][0] + a[j][l - 1];
		}
			}
		}

		System.out.printf("%d\n",sum);


		}
	}
}

