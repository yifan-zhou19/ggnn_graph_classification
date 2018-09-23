package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		int x,y;
	//	}
	//	a[25];
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
				a[i].x = tempVar2;
			}
		}
		int max = 0;
		int j;
		for (j = 0;j < n;j++)
		{
			int k = 0;
			for (i = j + 1;i < n;i++)
			{
				if (a[i].x < a[j].x)
				{
					k++;
				}
			}
			a[j].y = k;
		}
		int w;
		for (i = n - 1;i >= 1;i--)
		{
			if (a[i - 1].y < a[i].y + 1)
			{
				a[i - 1].y = a[i].y;
				w++;
			}
		}
		System.out.printf("%d",n - w);
		return 0;
	}
}

