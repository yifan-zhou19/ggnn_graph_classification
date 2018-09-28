package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int x;
	//		int y;
	//	}
	//	sz[100];
		int n;
		int i;
		int a = 0;
		int b = 0;
		int[] cs = new int[100];
		int max;
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
			if (sz[i].x >= 90 && sz[i].x <= 140 && sz[i].y >= 60 && sz[i].y <= 90)
			{
				a += 1;
				if (i == n - 1)
				{
					max = a;
				}
			}
			else
			{
				cs[b] = a;
				a = 0;
				b += 1;
				if (i == n - 1)
				{
					max = cs[0];
				}
			}
		}
		for (i = 0;i < b;i++)
		{
				if (cs[i] > max)
				{
				max = cs[i];
				}
		}
		System.out.printf("%d",max);
		return 0;
	}


}

