package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int a = 0;
		int b = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct cq1
	//	{
	//		int x,y;
	//	}
	//	cq[200];
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
				(cq[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(cq[i].y) = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (((cq[i].x == 0) && (cq[i].y == 1)) || ((cq[i].x == 1) && (cq[i].y == 2)) || ((cq[i].x == 2) && (cq[i].y == 0)))
			{
				a = a + 1;
			}
			else if (((cq[i].y == 0) && (cq[i].x == 1)) || ((cq[i].y == 1) && (cq[i].x == 2)) || ((cq[i].y == 2) && (cq[i].x == 0)))
			{
				b = b + 1;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}


}

