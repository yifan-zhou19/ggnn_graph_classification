package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] x = new int[n][3];
		double[][] jl = new double[10][10];
		double o;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int k = i + 1;k < n;k++)
			{
				jl[i][k] = 0;
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int k = i + 1;k < n;k++)
			{
				jl[i][k] = Math.sqrt((x[i][0] - x[k][0]) * (x[i][0] - x[k][0]) + (x[i][1] - x[k][1]) * (x[i][1] - x[k][1]) + (x[i][2] - x[k][2]) * (x[i][2] - x[k][2]));
			}
		}
		o = 0;
		int m;
		int p;
		int q;
		int a = 0;
		m = n * (n - 1) / 2;
		for (int i = 0;i < 9;i++)
		{
			if (a == m)
			{
				break;
			}
			for (int k = i + 1;k < 10;k++)
			{
				if (o < jl[i][k])
				{
					o = jl[i][k];
					p = i;
					q = k;
				}
				if (i == 8 && k == 9)
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[p][0],x[p][1],x[p][2],x[q][0],x[q][1],x[q][2],o);
					jl[p][q] = 0;
					i = -1;
					o = 0;
					a++;
				}
			}
		}
		return 0;
	}










}

