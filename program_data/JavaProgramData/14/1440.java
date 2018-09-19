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
	//	struct score
	//	{
	//		int id;
	//		int yw;
	//		int sx;
	//	}
	//	stu [100000];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yw = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].sx = tempVar4;
			}
		}
		for (j = 1;j <= 3;j++)
		{
			int e;
			int max = 0;
			for (i = 0;i <= n - j;i++)
			{
				if ((stu[i].yw + stu[i].sx) > (stu[max].yw + stu[max].sx))
				{
					max = i;
				}
			}
			if (max != n - j)
			{
				e = stu[max].yw;
				stu[max].yw = stu[n - j].yw;
				stu[n - j].yw = e;

				e = stu[max].sx;
				stu[max].sx = stu[n - j].sx;
				stu[n - j].sx = e;

				e = stu[max].id;
				stu[max].id = stu[n - j].id;
				stu[n - j].id = e;
			}
		}
		for (i = n - 1;i >= n - 2;i--)
		{
			System.out.printf("%d %d\n",(stu[i].id),(stu[i].yw + stu[i].sx));
		}
		System.out.printf("%d %d",(stu[n - 3].id),(stu[n - 3].yw + stu[n - 3].sx));
		return 0;
	}
}

