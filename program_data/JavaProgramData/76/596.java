package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int p;
		int m;
		int q;
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
		for (t = 0;t < n;t++)
		{
			if (l[t].y > l[m].y)
			{
				m = t;
			}
		}
		for (q = 1;q < n;q++)
		{
			for (p = 0;p < q;p++)
			{
				 if (l[p].y >= l[q].x)
				 {
					  break;
				 }
				 if (p == q - 1 && l[p].y < l[q].x)
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
		//lp:printf("e%d %d",q,p);
		return 0;
	}


}

