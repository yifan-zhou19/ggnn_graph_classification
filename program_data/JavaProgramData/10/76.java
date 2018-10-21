package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int h,r;
	//	}
	//	a[30];
		int i;
		int j;
		int m;
		int n;
		int k = 1;
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
				a[i].h = tempVar2;
			}
			a[i].r = 1;
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i].h >= a[j].h) && (a[i].r <= (a[j].r + 1)))
				{
					a[i].r = a[j].r + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (k <= a[i].r)
			{
				k = a[i].r;
			}
		}
		System.out.printf("%d\n",k);
		return 0;
	}
}

