package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		double a;
		double b;
		double c;
		double u;
		double v;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct f
	//	{
	//		double a,b,c,u,v;
	//	}
	//	f[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			f[i].a = a;
			f[i].b = b;
			f[i].c = c;
			f[i].u = -b / (2 * a);
			if (b == 0)
			{
			   f[i].u = 0;
			}
			f[i].v = Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2 * a); //double use fabs
		}
		for (i = 0;i < m;i++)
		{
			if (f[i].b * f[i].b - 4 * f[i].a * f[i].c > 0) //f[i].a=a;f[i].b=b;f[i].c=c;de yiyi jiu zai ci
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",f[i].u + f[i].v,f[i].u - f[i].v);
			}
			else if (f[i].b * f[i].b - 4 * f[i].a * f[i].c == 0)
			{
				System.out.printf("x1=x2=%.5f\n", f[i].u + f[i].v,f[i].u - f[i].v);
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",f[i].u,f[i].v,f[i].u,f[i].v);
			}
		}
		return 0;
	}

}

