package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char a[100];
	//		double b;
	//	}
	//	points[100];
		int n;
		int i = 0;
		int k = 1;
		String p = new String(new char[100]);
		double d;
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
				points[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				points[i].b = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (points[i].b > points[i + 1].b)
				{
					d = points[i + 1].b;
					points[i + 1].b = points[i].b;
					points[i].b = d;
					p = points[i + 1].a;
					points[i + 1].a = points[i].a;
					points[i].a = p;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(points[i].a,"male") == 0)
			{
				System.out.printf("%.2lf",points[i].b);
				break;
			}
		}

		for (i = i + 1;i < n;i++)
		{
			if (strcmp(points[i].a,"male") == 0)
			{
				 System.out.printf(" %.2lf",points[i].b);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (strcmp(points[i].a,"female") == 0)
			{
				System.out.printf(" %.2lf",points[i].b);
			}
		}








		 return 0;
	}
}

