package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char a[12];
	//		double b;
	//	}
	//	q[50];
		String e = new String(new char[50]);
		double[] d = new double[50];
		double k;
		int i;
		int j;
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i].b = tempVar3;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 2 - i;j++)
			{
				if (q[j].b > q[j + 1].b)
				{
					k = q[j].b;
					q[j].b = q[j + 1].b;
					q[j + 1].b = k;
					e = q[j].a;
					q[j].a = q[j + 1].a;
					q[j + 1].a = e;
				}
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (q[i].a[0] == 'm')
			{
				System.out.printf("%.2lf ",q[i].b);

			}
		}
		l = 0;
		for (i = n - 1;i >= 0;i--)
		{
			if (q[i].a[0] == 'f')
			{
				d[l] = q[i].b;
				l++;
			}
		}
		for (i = 0;i <= l - 2;i++)
		{
			System.out.printf("%.2lf ",d[i]);
		}
		System.out.printf("%.2lf",d[l - 1]);
		return 0;
	}



}

