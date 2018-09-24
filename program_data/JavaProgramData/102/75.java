package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		char x[6];
	//		double y;
	//	}
	//	as[40],t;
		int n;
		int i;
		int k;
		int I;
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
				as[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				as[i].y = tempVar3;
			}
		}
		for (k = 0;k < n;k++)
		{
			for (i = 1;i < n - k;i++)
			{
			if (as[i].y < as[i - 1].y)
			{
				t = as[i];
				as[i] = as[i - 1];
				as[i - 1] = t;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(as[i].x,"male") == 0)
			{
				System.out.printf("%.2lf ",as[i].y);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (strcmp(as[i].x,"female") == 0)
			{
				System.out.printf("%.2lf",as[i].y);
				I = i;
				break;
			}
		}
		for (i = I - 1;i >= 0;i--)
		{
			if (strcmp(as[i].x,"female") == 0)
			{
				System.out.printf(" %.2lf",as[i].y);
			}
		}
		return 0;
	}



}

