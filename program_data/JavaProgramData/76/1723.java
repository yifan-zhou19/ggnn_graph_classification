package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int t = 0;
		int k = 0;
		int min;
		int e;
		int f;
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
	//	p[N];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
		}
		min = p[0].x;
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (p[i].x > p[i + 1].x)
				{
					e = p[i].x;
					p[i].x = p[i + 1].x;
					p[i + 1].x = e;
					f = p[i].y;
					p[i].y = p[i + 1].y;
					p[i + 1].y = f;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].y > max)
			{
				max = p[i].y;
			}
			if (p[i].x < min)
			{
				min = p[i].x;
			}
		}
		for (i = 1;i < n;i++)
		{
			t = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (p[i].x > p[j].y)
				{
					t = t + 1;
				}
			}
			if (t == i)
			{
				k = k + 1;
			}
		}
		if (k >= 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

