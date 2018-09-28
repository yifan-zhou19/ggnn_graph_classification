package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct region
	//	{
	//		   int x;
	//		   int y;
	//	}
	//	a[n],re;
		for (i = 0;i <= n - 1;i++)
		{
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   a[i].x = tempVar2;
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   a[i].y = tempVar3;
						   }
		}
		re.x = a[0].x;
		re.y = a[0].y;
		for (j = 0;j <= n - 1;j++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				if ((a[i].x <= re.x && a[i].y >= re.x) || (a[i].x >= re.x && a[i].x <= re.y))
				{
					 if (re.x > a[i].x)
					 {
						 re.x = a[i].x;
					 }
					 if (re.y < a[i].y)
					 {
						 re.y = a[i].y;
					 }
					 a[i] = re;

				}
			}
		}
		for (j = 1;j <= n - 1;j++)
		{
						   if (re.x != a[j].x || re.y != a[j].y)
						   {
									   System.out.print("no");

									   return 0;
						   }
		}
		System.out.printf("%d %d",re.x,re.y);

		return 0;
	}
}

