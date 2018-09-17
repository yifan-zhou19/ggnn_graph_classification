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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char x[10];
	//		double y;
	//	}
	//	b[40];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].y = tempVar3;
			}
		}
		int p = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(b[i].x,"male") == 0)
			{
				p += 1;
			}
		}
		double[] d = new double[40];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(b[i].x,"male") == 0)
			{
				d[k] = b[i].y;
				k += 1;
			}
		}
		double m;
		for (k = 1;k < p;k++)
		{
			for (i = 0;i < p - k;i++)
			{
				if (d[i] > d[i + 1])
				{
					m = d[i];
					d[i] = d[i + 1];
					d[i + 1] = m;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%.2lf ",d[i]);
		}
		double[] e = new double[40];
		int r = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(b[i].x,"female") == 0)
			{
				e[r] = b[i].y;
				r++;
			}
		}
		for (k = 1;k < n - p;k++)
		{
			for (i = 0;i < n - p - k;i++)
			{
				if (e[i] < e[i + 1])
				{
					m = e[i];
					e[i] = e[i + 1];
					e[i + 1] = m;
				}
			}
		}
		for (i = 0;i < n - p - 1;i++)
		{
			System.out.printf("%.2lf ",e[i]);
		}
		System.out.printf("%.2lf",e[n - p - 1]);
		return 0;
	}
}

