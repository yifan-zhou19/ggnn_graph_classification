package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int num;
	//		int x[4];
	//		int y[4];
	//		double d;
	//	}
	//	a[N*(N-1)/2],t;

		double dis = new double(int x[3],int y[3]);

		int[][] p = new int[N][3];
		int n;
		int i;
		int j;
		int r;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0,r = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{

				a[r].d = dis(p[i], p[j]);
				//printf("%.2lf\n",a[r].d);
				for (k = 0;k < 3;k++)
				{
					a[r].x[k] = p[i][k];
					a[r].y[k] = p[j][k];
				}

				a[r].x[3] = i;
				a[r].y[3] = j;

				r++;
			}
		}

		n = r;

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j].d < a[j + 1].d)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}

				else if (a[j].d == a[j + 1].d)
				{
					if (a[j].x[3] > a[j + 1].x[3])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=",a[i].x[0],a[i].x[1],a[i].x[2],a[i].y[0],a[i].y[1],a[i].y[2]);
			System.out.printf("%.2lf\n",a[i].d);
		}

		return 0;


	}

	public static double dis(int[] x, int[] y)
	{
		double z = 0;
		int i;

		for (i = 0;i < 3;i++)
		{
			z = z + 1.0 * (y[i] - x[i]) * (y[i] - x[i]);
		}

		z = Math.sqrt(z);

		return z;
	}
}

