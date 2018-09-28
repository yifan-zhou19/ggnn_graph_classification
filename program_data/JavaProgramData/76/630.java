package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int m;
		int j;
		int k;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		int x,y;
	//	}
	//	sz[50000];
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
				sz[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i].y = tempVar3;
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i].x > sz[i + 1].x)
				{
					e = sz[i + 1].x;
					m = sz[i + 1].y;
					sz[i + 1].x = sz[i].x;
					sz[i + 1].y = sz[i].y;
					sz[i].x = e;
					sz[i].y = m;
				}
			}
		}
		b = sz[0].y;
		c = sz[0].y;
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (b < sz[i].y)
			{
				b = sz[i].y;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (c < sz[i].y)
			{
				c = sz[i].y;
			}
			if (sz[i].y < sz[i + 1].x && sz[i + 1].x> c)
			{
				System.out.print("no");
				j = 1;
				break;
			}
		}
		if (j == 0)
		{
			System.out.printf("%d %d",sz[0].x,b);
		}
		 return 0;
	}

}

