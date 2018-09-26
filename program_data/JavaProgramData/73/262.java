package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] min = {10000000, 10000000, 10000000, 10000000, 10000000};
		int[] max = {-10000000, -10000000, -10000000, -10000000, -10000000, 0, 0, 0, 0, 0};
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int o = 0;
		int p;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				//printf("%d %d %d %d\n",i,j,a[i][j],max[i]);
				if (a[i][j] > max[i])
				{

					max[i] = a[i][j];
					//printf("%d",j);
					b[i] = j;
				}
			}
		}
		//printf("1111111");
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				//printf("%d %d %d %d\n",i,j,a[i][j],min[j]);
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
					c[j] = i;
				}
			}
		}
		//printf("222222");
		for (i = 0;i < 5;i++)
		{
			//printf("33333");
			//printf(" %d %d\n",i,b[i]);
			if (c[b[i]] == i)
			{
				o++;
			System.out.printf("%d %d %d\n",i + 1,b[i] + 1,a[i][b[i]]);
			}
		}
		if (o == 0)
		{
			System.out.print("not found");
		}
		//scanf("%d",&k);
		return 0;
	}


}

