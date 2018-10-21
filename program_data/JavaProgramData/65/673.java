package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] sz = new int[1000];
	int[] s = new int[1000];
	int i = 0;
	int m = 0;
	int l = 0;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct cui
	//{
	//	int x;
	//	int y;
	//}
	//cui[300];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			cui[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cui[i].y = tempVar3;
		}
	}
	m = 0;
	for (i = 0;i < n;i++)
	{
		if (cui[i].x == cui[i].y)
		{
			m = m + 1;
		}
		if (cui[i].x == 0)
		{
			if (cui[i].y == 1)
			{
				k = k + 1;
			}
			else if (cui[i].y == 2)
			{
				l = l + 1;
			}
		}
		else if (cui[i].x == 1)
		{
			if (cui[i].y == 0)
			{
				l = l + 1;
			}
			else if (cui[i].y == 2)
			{
				k = k + 1;
			}
		}
		else if (cui[i].x == 2)
		{
			if (cui[i].y == 0)
			{
				k = k + 1;
			}
			else if (cui[i].y == 1)
			{
				l = l + 1;
			}
		}
	}

		if (k > l)
		{
			System.out.print("A");
		}
		else if (l > k)
		{
			System.out.print("B");
		}
		else if (l = k)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

