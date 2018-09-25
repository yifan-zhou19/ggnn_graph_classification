package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int nm = 0;
		int nf = 0;
		int j;
		double[] m = new double[40];
		double[] f = new double[40];
		double t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		char s[10];
	//		double l;
	//	}
	//	a[40];
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
				a[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].l = tempVar3;
			}
			if (a[i].s[0] == 'm')
			{
				m[nm] = a[i].l;
				nm++;
			}
			else
			{
				f[nf] = a[i].l;
				nf++;
			}
		}
		for (i = 0;i < nm - 1;i++)
		{
			for (j = i + 1;j < nm;j++)
			{
				if (m[j] < m[i])
				{
					t = m[i];
					m[i] = m[j];
					m[j] = t;
				}
			}
		}
		for (i = 0;i < nf - 1;i++)
		{
			for (j = i + 1;j < nf;j++)
			{
				if (f[j] > f[i])
				{
					t = f[i];
					f[i] = f[j];
					f[j] = t;
				}
			}
		}
		for (i = 0;i < nm;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < nf - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf\n",f[nf - 1]);
		return 0;
	}
}

