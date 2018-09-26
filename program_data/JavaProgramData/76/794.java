package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x,y;
	//	}
	//	sz[50000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i].y = tempVar3;
			}
		}
		int i;
		int p;
		int q;
		for (int k = 1;k < n;k++)
		{
		  for (i = 0;i < n - k;i++)
		  {
			 if (sz[i].x > sz[i + 1].x)
			 {
				 p = sz[i].x;
				 sz[i].x = sz[i + 1].x;
				 sz[i + 1].x = p;
			 }
			 if (sz[i].y > sz[i + 1].y)
			 {
				 q = sz[i].y;
				 sz[i].y = sz[i + 1].y;
				 sz[i + 1].y = q;
			 }
		  }
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i].y < sz[i + 1].x)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",sz[0].x,sz[n - 1].y);
		return 0;
	}




}

