package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct std
	//	{
	//		char sex[7];
	//		double height;
	//	}
	//	ss[50];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] man = new double[50];
		double[] wam = new double[50];
		int i;
		int j = 0;
		int m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ss[i].height = tempVar3;
			}
			if (strcmp(ss[i].sex,"male") == 0)
			{
				man[j] = ss[i].height;
				j++;
			}
			if (strcmp(ss[i].sex,"female") == 0)
			{
				wam[m] = ss[i].height;
				m++;
			}
		}
		int k;
		int x;
		double e;
		for (k = 1;k <= j;k++)
		{
			for (x = 0;x < j - k;x++)
			{
				if (man[x] > man[x + 1])
				{
					e = man[x];
					man[x] = man[x + 1];
					man[x + 1] = e;
				}
			}
		}
		for (k = 1;k <= m;k++)
		{
			for (x = 0;x < m - k;x++)
			{
				if (wam[x] < wam[x + 1])
				{
					e = wam[x];
					wam[x] = wam[x + 1];
					wam[x + 1] = e;
				}
			}
		}
		int a;
		int b;
		for (a = 0;a < j;a++)
		{
			System.out.printf("%.2lf ",man[a]);
		}
		for (b = 0;b < m;b++)
		{
			if (b != m - 1)
			{
				System.out.printf("%.2lf ",wam[b]);
			}
			else
			{
				System.out.printf("%.2lf",wam[b]);
			}
		}
		return 0;
	}
}

