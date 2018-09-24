package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int k;
		int j;
		double[] m = new double[40];
		double[] f = new double[40];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ren
	//	{
	//		char s[10];
	//		double h;
	//	}
	//	r[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r[i].h = tempVar3;
			}
			if (strcmp(r[i].s,"male") == 0)
			{
				m[a] = r[i].h;
				a++;
			}
			if (strcmp(r[i].s,"female") == 0)
			{
				f[b] = r[i].h;
				b++;
			}
		}
		for (k = 1; k <= a; k++)
		{
			double e;
			for (int i = 0; i < a - k; i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}

		}
		for (k = 1; k <= b; k++)
		{
			double e;
			for (int i = 0; i < b - k; i++)
			{
				if (f[i] > f[i + 1])
				{
					e = f[i + 1];
					f[i + 1] = f[i];
					f[i] = e;
				}
			}

		}
		System.out.printf("%.2lf",m[0]);
		for (j = 1;j < a;j++)
		{
			System.out.printf(" %.2lf",m[j]);
		}
		for (j = b - 1;j >= 0;j--)
		{
			System.out.printf(" %.2lf",f[j]);
		}
		return 0;
	}


}

