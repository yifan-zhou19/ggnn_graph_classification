package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int e;
		int p;
		int q;
		int s = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		   int x,y;
	//	}
	//	points[50000];
		for (i = 0;i < n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b = Integer.parseInt(tempVar3);
			   }
			   points[i].x = a;
			   points[i].y = b;
		}
		for (k = 1;k <= n;k++)
		{
			   for (i = 0;i < n - k;i++)
			   {
					   if (points[i].x > points[i + 1].x)
					   {
							  t = points[i].x;
							  points[i].x = points[i + 1].x;
							  points[i + 1].x = t;
							  e = points[i].y;
							  points[i].y = points[i + 1].y;
							  points[i + 1].y = e;
					   }
			   }
		}
		p = points[0].x;
		for (i = 0;i < n;i++)
		{
				if (points[i].y >= points[i + 1].x)
				{
					if (points[i].y > points[i + 1].y)
					{
						 points[i + 1].y = points[i].y;
					}
				}
				else
				{
						 s++;
				}
		}

		q = points[n - 1].y;
		if (s == 0)
		{
			   System.out.printf("%d %d",p,q);
		}
		else
		{
			   System.out.print("no");
		}

		return 0;
	}
}

