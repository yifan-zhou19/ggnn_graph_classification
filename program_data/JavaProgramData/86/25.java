package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int m;
	//		int a[20];
	//	}
	//	p[80];
		int[] x = new int[80];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].m = tempVar2;
			}
			if (p[i].m == 0)
			{
				x[i] = 60;
			}
			if (p[i].m != 0)
			{
				for (j = 0;j < p[i].m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[i].a[j] = tempVar3;
					}
					if ((j == p[i].m - 1) && ((p[i].a[j] + j * 3) < 60))
					{
						if ((p[i].a[j] + j * 3 + 3) <= 60)
						{
							x[i] = 60 - 3 * p[i].m;
						}
						if ((p[i].a[j] + j * 3 + 3) > 60)
						{
							x[i] = p[i].a[j];
						}
					}
					if (((p[i].a[j] + j * 3) >= 60) && ((p[i].a[j - 1] + j * 3 - 3) < 60))
					{
						if ((p[i].a[j] + j * 3) == 60)
						{
							x[i] = p[i].a[j];
						}
						if ((p[i].a[j] + j * 3) > 60)
						{
							if ((p[i].a[j - 1] + j * 3) < 60)
							{
								x[i] = 60 - (p[i].a[j - 1] + j * 3) + p[i].a[j - 1];
							}
							if ((p[i].a[j - 1] + j * 3) >= 60)
							{
								x[i] = p[i].a[j - 1];
							}
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",x[i]);
		}
		return 0;
	}

}

