package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pe
	//	{
	//		char a[10];
	//		double h;
	//	}
	//	pe[40];
		int n;
		int i;
		int j = 0;
		int k = 0;
		int q;
		double[] m = new double[500];
		double[] f = new double[500];
		double temp;
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
				pe[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pe[i].h = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pe[i].a[0] == 'm')
			{
				m[j] = pe[i].h;
				j++;

			}
			if (pe[i].a[0] == 'f')
			{
				f[k] = pe[i].h;
				k++;
			}
		}
		for (i = 0;i <= j - 1 - 1;i++)
		{
			for (q = 0;q < j - 1 - i;q++)
			{
			   if (m[q] > m[q + 1])
			   {
				   temp = m[q];
					m[q] = m[q + 1];
					m[q + 1] = temp;
			   }
			}
		}
		for (i = 0;i <= k - 1 - 1;i++)
		{
			for (q = 0;q < k - 1 - i;q++)
			{
			   if (f[q] > f[q + 1])
			   {
				   temp = f[q];
					f[q] = f[q + 1];
					f[q + 1] = temp;
			   }
			}
		}

		System.out.printf("%.2lf",m[0]);
		for (i = 1;i < j;i++)
		{
		System.out.printf(" %.2lf",m[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2lf",f[k - 1 - i]);
		}
	return 0;
	}

}

