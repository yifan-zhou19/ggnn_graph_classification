package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		double t;
		double[] a = new double[100];
		double[] b = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char x[10];
	//		double h;
	//	}
	//	s[100];
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
				(s[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(s[i].h) = tempVar3;
			}
		}
		p = 0;
		q = 0;
		for (i = 0;i < n;i++)
		{
				if (s[i].x[0] == 'm')
				{
					a[p] = s[i].h;
					p++;
				}
				else
				{
					b[q] = s[i].h;
					q++;
				}

		}
		for (j = 1;j <= p;j++)
		{
			for (i = 0;i < p - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i + 1];
					a[i + 1] = a[i];
					a[i] = t;
				}
			}
		}
		for (j = 1;j <= q;j++)
		{
			for (i = 0;i < q - j;i++)
			{
				if (b[i] < b[i + 1])
				{
					t = b[i + 1];
					b[i + 1] = b[i];
					b[i] = t;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%.2lf ",a[i]);
		}
		for (i = 0;i < q;i++)
		{
			if (i != q - 1)
			{
				System.out.printf("%.2lf ",b[i]);
			}
			if (i == q - 1)
			{
				System.out.printf("%.2lf",b[i]);
			}
		}
		return 0;
	}

}

