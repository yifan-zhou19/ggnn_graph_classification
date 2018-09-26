package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int m;
		int a;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct l
	//	{
	//		int x,y;
	//	}
	//	l[n],e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(l[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(l[i].y) = tempVar3;
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (l[i].x > l[i + 1].x)
				{
					e = l[i];
					l[i] = l[i + 1];
					l[i + 1] = e;
				}
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (l[i].y > l[m].y)
			{
				m = i;
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < k;i++)
			{
				 if (l[i].y >= l[k].x)
				 {
					  break;
				 }
				 if (i == k - 1 && l[i].y < l[k].x)
				 {
					 a = 1;
				 }
			}
		}
		if (a == 0)
		{
				System.out.printf("%d %d",l[0].x,l[m].y);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

