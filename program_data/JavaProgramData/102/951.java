package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct aa
	//	{
	//		char a[7];
	//		double b;
	//	}
	//	a[100];
		int m = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		double[] d = new double[100];
		double[] e = new double[100];
		for (int c = 0; c < n; c++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[c].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[c].b = tempVar3;
			}
			if (a[c].a[0] == 'm')
			{
				m++;
				d[g] = a[c].b;
				g++;
			}
			else
			{
				f++;
				e[h] = a[c].b;
				h++;
			}
		}
		for (int j = m - 1; j > 0; j--)
		{
			for (int r = 0; r < j; r++)
			{
				if (d[r] > d[r + 1])
				{
					double tmp;
					tmp = d[r + 1];
					d[r + 1] = d[r];
					d[r] = tmp;
				}
			}
		}
		for (int j = h - 1; j > 0; j--)
		{
			for (int r = 0; r < j; r++)
			{
				if (e[r] < e[r + 1])
				{
					double tmp;
					tmp = e[r + 1];
					e[r + 1] = e[r];
					e[r] = tmp;
				}
			}
		}
		for (int k = 0; k < m; k++)
		{
			System.out.printf("%.2lf ", d[k]);
		}
		for (int l = 0; l < f - 1; l++)
		{
			System.out.printf("%.2lf ", e[l]);
		}
		System.out.printf("%.2lf", e[f - 1]);
	}
}

