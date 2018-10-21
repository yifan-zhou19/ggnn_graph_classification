package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int b,c;
	//	}
	//	a[201];
		int i;
		int n;
		int p = 0;
		int q = 0;
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
				(a[i].b) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i].c) = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i].b) == 1 && (a[i].c) == 2)
			{
				p += 1;
			}
			else if ((a[i].b) == 2 && (a[i].c) == 0)
			{
				p += 1;
			}
			else if ((a[i].b) == 0 && (a[i].c) == 1)
			{
				p += 1;
			}
			else if ((a[i].b) == 1 && (a[i].c) == 0)
			{
				q += 1;
			}
			else if ((a[i].b) == 2 && (a[i].c) == 1)
			{
				q += 1;
			}
			else if ((a[i].b) == 0 && (a[i].c) == 2)
			{
				q += 1;
			}
		}
		if (p > q)
		{
			System.out.print("A");
		}
		else if (p < q)
		{
			System.out.print("B");
		}
		else if (p = q)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

