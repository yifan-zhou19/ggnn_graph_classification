package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int z;
		int y;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] c = new double[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ppp
	//	{
	//	char a[6];
	//	double b;
	//	}
	//	p[n+2];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].b = tempVar3;
			}
		}
		for (i = 1;i <= n;i++)
		{
						 for (j = 1;j < n;j++)
						 {
							 if (p[j].b > p[j + 1].b)
							 {
												 p[0] = p[j];
												 p[j] = p[j + 1];
												 p[j + 1] = p[0];
							 }
						 }
		}
		z = 0;
		y = n - 1;
		for (i = 1;i <= n;i++)
		{
						 if (strcmp(p[i].a,"male") == 0)
						 {
											c[z] = p[i].b;
											z++;
						 }
						 else
						 {
							 c[y] = p[i].b;
							 y--;
						 }
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
			System.out.print(" ");
			}
			System.out.printf("%.2lf",c[i]);

		}


		return 0;
	}

}

