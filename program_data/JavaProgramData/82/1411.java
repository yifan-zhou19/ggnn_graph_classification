package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int a = 0;
		int d = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct xy
	//	{
	//		int ssy,szy;
	//	}
	//	xy[100];
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
				(xy[i].ssy) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(xy[i].szy) = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((xy[i].ssy >= 90) && (xy[i].ssy <= 140) && (xy[i].szy <= 90) && (xy[i].szy >= 60))
			{
				a = a + 1;
			}
			else
			{
				a = 0;
			}
			if (a > d)
			{
				d = a;
			}
		}
		System.out.printf("%d",d);
		return 0;
	}

}

