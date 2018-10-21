package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] axis = new int[10000];
		int ms = 0;
		int me = 0;
		int a = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct range
	//	{
	//		int s,e;
	//	}
	//	r[50000];
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
				r[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				r[i].e = tempVar3;
			}
			for (j = r[i].s;j < r[i].e;j++)
			{
				axis[j] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (r[i].s < r[ms].s)
			{
				ms = i;
			}
			if (r[i].e > r[me].e)
			{
				me = i;
			}
		}
		for (i = r[ms].s;i <= r[me].e;i++)
		{
			a += axis[i];
		}
		if (a == r[me].e - r[ms].s)
		{
			System.out.printf("%d %d",r[ms].s,r[me].e);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

