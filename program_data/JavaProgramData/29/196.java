package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] sz = new int[1000];
	double[] result = new double[1000];

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct p
	//{
	//	int a,b;
	//	double c;
	//}
	//p[1000];
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
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	p[0].a = 2;
	p[0].b = 1;
	p[0].c = (double)p[0].a / p[0].b;
	p[1].a = 3;
	p[1].b = 2;
	p[1].c = (double)p[1].a / p[1].b;
	for (i = 0;i < n;i++)
	{
		if (sz[i] == 1)
		{
			System.out.printf("%.3lf\n",p[0].c);
		}
		else if (sz[i] == 2)
		{
			System.out.printf("%.3lf\n",p[0].c + p[1].c);
		}
		else
		{
			for (j = 2;j < sz[i];j++)
			{
				p[j].a = p[j - 1].a + p[j - 2].a;
				p[j].b = p[j - 1].b + p[j - 2].b;
				p[j].c = (double)p[j].a / p[j].b;
				 result[i] += p[j].c;
			}

			System.out.printf("%.3lf\n",p[0].c + p[1].c + result[i]);
		}
	}

		return 0;
	}
}

