package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		int u,v;
	//	}
	//	p[100];
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
				p[i].u = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].v = tempVar3;
			}
			if (p[i].u >= 90 && p[i].u <= 140 && p[i].v >= 60 && p[i].v <= 90)
			{
				j = j + 1;
				if (j > m)
				{
					m = j;
				}
			}
			else
			{
				j = 0;
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
}

