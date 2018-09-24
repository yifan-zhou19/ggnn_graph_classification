package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int i;
		int j;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double d;
	//		int nu1,nu2;
	//	}
	//	p[50],zh;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				p[k].d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				p[k].nu1 = j;
				p[k].nu2 = i;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (p[j].d > p[j + 1].d)
				{
					zh = p[j + 1];
					p[j + 1] = p[j];
					p[j] = zh;
				}
				else if (p[j].d == p[j + 1].d)
				{
					if (p[j].nu1 < p[j + 1].nu1)
					{
						zh = p[j + 1];
					p[j + 1] = p[j];
					p[j] = zh;
					}
					else if ((p[j].nu1 == p[j + 1].nu1) && (p[j].nu2 < p[j + 1].nu2))
					{
						zh = p[j + 1];
					p[j + 1] = p[j];
					p[j] = zh;
					}
				}
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[p[i].nu1],y[p[i].nu1],z[p[i].nu1],x[p[i].nu2],y[p[i].nu2],z[p[i].nu2],p[i].d);
		}
		return 0;
	}
}

