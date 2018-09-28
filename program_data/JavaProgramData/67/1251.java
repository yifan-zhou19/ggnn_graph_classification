package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int x;
	int y;
	double b;
	double c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct s
	// {
	//  int x;
	//  int y;
	// };
	s[] sz = tangible.Arrays.initializeWithDefaultsInstances(100);
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		sz[i].x = x;
		sz[i].y = y;
	}
	b = sz[0].y * 1.0 / sz[0].x;
	for (i = 1;i < n;i++)
	{
		c = sz[i].y * 1.0 / sz[i].x;
		if (c - b > 0.05)
		{
			System.out.print("better\n");
		}
		else if (b - c > 0.05)
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

