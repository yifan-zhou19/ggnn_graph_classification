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
	//	sz[200];
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
		int x = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i].a == 1 && sz[i].b == 0)
			{
				x += 1;
			}
			if (sz[i].a == 0 && sz[i].b == 1)
			{
				x -= 1;
			}
			if (sz[i].a == 2 && sz[i].b == 0)
			{
				x -= 1;
			}
			if (sz[i].a == 0 && sz[i].b == 2)
			{
				x += 1;
			}
			if (sz[i].a == 1 && sz[i].b == 2)
			{
				x -= 1;
			}
			if (sz[i].a == 2 && sz[i].b == 1)
			{
				x += 1;
			}
		}

		if (x > 0)
		{
			System.out.print("B\n");
		}
		else if (x == 0)
		{
			System.out.print("Tie\n");
		}
		else if (x < 0)
		{
			System.out.print("A\n");
		}
		return 0;
	}
}

