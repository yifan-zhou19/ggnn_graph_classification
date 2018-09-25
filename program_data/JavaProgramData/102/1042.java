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
	//		char a[10];
	//		double b;
	//	}
	//	sz[40];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i].b = tempVar3;
			}
		}
		int count1 = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(sz[i].a,"male") == 0)
			{
				count1 += 1;
			}
		}
		int count2 = n - count1;
		double[] xsz = new double[40];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(sz[i].a,"male") == 0)
			{
				xsz[k] = sz[i].b;
				k += 1;
			}
		}
		int j;
		double p;
		for (j = 1;j <= count1;j++)
		{
			for (i = 0;i < count1 - j;i++)
			{
				if (xsz[i] > xsz[i + 1])
				{
					p = xsz[i];
					xsz[i] = xsz[i + 1];
					xsz[i + 1] = p;
				}
			}
		}
		int o = 0;
		double[] xxsz = new double[40];
		for (i = 0;i < n;i++)
		{
			if (strcmp(sz[i].a,"female") == 0)
			{
				xxsz[o] = sz[i].b;
				o += 1;
			}
		}
		double q;
		for (j = 1;j < n - count1;j++)
		{
			for (i = 0;i < n - count1 - j;i++)
			{
				if (xxsz[i] < xxsz[i + 1])
				{
					q = xxsz[i];
					xxsz[i] = xxsz[i + 1];
					xxsz[i + 1] = q;
				}
			}
		}
		for (i = 0;i < count1;i++)
		{
			System.out.printf("%.2lf ",xsz[i]);
		}
		for (i = 0;i < n - count1 - 1;i++)
		{
			System.out.printf("%.2lf ",xxsz[i]);
		}
		System.out.printf("%.2lf",xxsz[n - count1 - 1]);
		return 0;
	}






}

