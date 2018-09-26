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
	//	struct asd
	//	{
	//		int x,y;
	//	}
	//	as[100000];
		int i;
		int j = 0;
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(as[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(as[i].y) = tempVar3;
			}
			if (as[i].x == 0 && as[i].y == 0)
			{
				break;
			}
			j++;
		}
		int g = 0;
		for (int t = 0;t < n;t++)
		{
			int e = 0;
			int f = 0;
			for (i = 0;i < j;i++)
			{
				if (as[i].x == t)
				{
					e++;
				}
				if (as[i].y == t)
				{
					f++;
				}
			}
			if (e == 0 && f == n - 1)
			{
				System.out.printf("%d",t);
				g++;
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

