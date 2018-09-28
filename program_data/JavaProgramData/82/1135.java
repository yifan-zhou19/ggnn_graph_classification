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
	//		int a,b;
	//	}
	//	sz[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i].b = tempVar3;
			}
		}
		int[] xsz = new int[100];
		int j;
		for (i = 0;i < n;i++)
		{
			if (sz[i].a >= 90 && sz[i].a <= 140 && sz[i].b >= 60 && sz[i].b <= 90)
			{
				xsz[i] += 1;
				for (j = i + 1;j < n;j++)
				{
					if (sz[j].a >= 90 && sz[j].a <= 140 && sz[j].b >= 60 && sz[j].b <= 90)
					{
						xsz[i] += 1;
					}
					else
					{
						break;
					}
				}
			}
		}
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (xsz[i] > max)
			{
				max = xsz[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}



}

