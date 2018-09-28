package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int flag = 1;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int a,b;
	//	}
	//	d[50000],e;
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
				d[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i].b = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (d[i].a > d[i + 1].a)
				{
					e = d[i];
					d[i] = d[i + 1];
					d[i + 1] = e;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (d[i].b < d[i + 1].a)
			{
				flag = 0;
				break;
			}
			else
			{
				if (d[i].b > d[i + 1].b)
				{
					t = d[i].b;
					d[i].b = d[i + 1].b;
					d[i + 1].b = t;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",d[0].a,d[n - 1].b);
		}
		return 0;
	}
}

