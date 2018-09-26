package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pare
	//	{
	//		double a;
	//		double b;
	//		double c;
	//	}
	//	p1[k];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1[i].c = tempVar4;
			}
		}
		double x1;
		double x2;
		double xx;
		double xs;
		for (i = 0; i < n; i++)
		{
			if ((p1[i].b * p1[i].b) - 4 * p1[i].a * p1[i].c > 0)
			{
				x1 = (-p1[i].b + Math.sqrt(p1[i].b * p1[i].b - 4 * p1[i].a * p1[i].c)) / (2 * p1[i].a);
				x2 = (-p1[i].b - Math.sqrt(p1[i].b * p1[i].b - 4 * p1[i].a * p1[i].c)) / (2 * p1[i].a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if ((p1[i].b * p1[i].b) - 4 * p1[i].a * p1[i].c == 0)
			{
				x1 = -p1[i].b / (2 * p1[i].a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (p1[i].b * p1[i].b - 4 * p1[i].a * p1[i].c < 0)
			{
				xs = -p1[i].b / (2 * p1[i].a);
				xx = (Math.sqrt(-p1[i].b * p1[i].b + 4 * p1[i].a * p1[i].c)) / (2 * p1[i].a);
				if (p1[i].b == 0)
				{
					System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",xx,xx);
				}
				else
				{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",xs,xx,xs,xx);
				}
			}
		}
		return 0;
	}




}

