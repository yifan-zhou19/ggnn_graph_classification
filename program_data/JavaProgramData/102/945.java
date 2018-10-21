package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double H;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct xs
	//	{
	//		char zfc[12];
	//		double h;
	//	}
	//	xs[41];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xs[i].zfc = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				xs[i].h = tempVar3;
			}
		}
		char c;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (xs[i].h > xs[i + 1].h)
				{
					c = xs[i].zfc[0];
					xs[i].zfc[0] = xs[i + 1].zfc[0];
					xs[i + 1].zfc[0] = c;
					H = xs[i].h;
					xs[i].h = xs[i + 1].h;
					xs[i + 1].h = H;
				}
			}
		}
		int d = 0;
		for (i = 0;i < n;i++)
		{
			if (xs[i].zfc[0] == 'm')
			{
					 System.out.printf("%.2lf ",xs[i].h);
					d++;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (d == n - 1)
			{
				if (xs[i].zfc[0] == 'f')
				{
				   System.out.printf("%.2lf",xs[i].h);
				   d++;
				}
			}
			else
			{
				if (xs[i].zfc[0] == 'f')
				{
				  System.out.printf("%.2lf ",xs[i].h);
				  d++;
				}
			}
		}
		return 0;
	}





}

