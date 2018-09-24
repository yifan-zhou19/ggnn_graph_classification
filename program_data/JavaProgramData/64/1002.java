package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int a;
		int b;
		int[][] sz = new int[200][4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] r = new double[200][200];
		double[] o = new double[100000];
		double e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i][3] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

			r[i][j] = Math.sqrt((double)(((sz[i][1]) - (sz[j][1])) * ((sz[i][1]) - (sz[j][1])) + ((sz[i][2]) - (sz[j][2])) * ((sz[i][2]) - (sz[j][2])) + ((sz[i][3]) - (sz[j][3])) * ((sz[i][3]) - (sz[j][3]))));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

			o[(i) * n + j] = r[i][j];

			}
		}
		for (i = 1;i <= n * n;i++)
		{
			for (j = 1;j < n * n;j++)
			{
				if (o[j] < o[j + 1])
				{
					e = o[j];
					o[j] = o[j + 1];
					o[j + 1] = e;

				}
			}
		}
		//for(i=1;i<=n*n;i++)cout<<o[i];
		for (i = 0;i < n * n;i++)
		{
			if (o[i] == o[i - 1])
			{
				continue;
			}
			for (j = 0;j < n;j++)
			{
				for (b = j + 1;b < n;b++)
				{
					if (o[i + 1] == r[j][b])
					{
						System.out.printf("(%d,%d,%d)",sz[j][1],sz[j][2],sz[j][3]);
						System.out.printf("%c",'-');
					System.out.printf("(%d,%d,%d)",sz[b][1],sz[b][2],sz[b][3]);
					System.out.printf("%c",'=');
					System.out.printf("%.2lf",r[b][j]);
					System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

