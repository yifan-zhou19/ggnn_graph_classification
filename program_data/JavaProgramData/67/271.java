package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jiegou
	//	{
	//		int a;
	//		int b;
	//		float x;
	//
	//	}
	//	sz[100];
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
				sz[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i].b = tempVar3;
			}
			sz[i].x = (float)1.0 * sz[i].b / sz[i].a * 100.0;
		}
		for (i = 1;i < n;i++)
		{
			if (sz[i].x - sz[0].x > 5)
			{
				System.out.print("better\n");
			}
			else if (sz[0].x - sz[i].x > 5)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

