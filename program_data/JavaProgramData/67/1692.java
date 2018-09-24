package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct lf
	//	{
	//		int x,y;
	//	}
	//	*lfs;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		lfs = (lf)malloc(sizeof(lf) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(lfs[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(lfs[i].y) = tempVar3;
			}
		}
		a = (1.0 * (lfs[0].y)) / (lfs[0].x);
		for (i = 1;i < n;i++)
		{
			b = (1.0 * (lfs[i].y)) / (lfs[i].x);
			if (b - a > 0.05)
			{
				System.out.print("\nbetter");
			}
			else if (a - b > 0.05)
			{
				System.out.print("\nworse");
			}
			else
			{
				System.out.print("\nsame");
			}
		}
		return 0;
	}

}

