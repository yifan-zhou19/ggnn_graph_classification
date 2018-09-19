package <missing>;

public class GlobalMembers
{
	public static int[] stu = new int[100000];
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int y;
		int t;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int a;
	//		int b;
	//		int c;
	//	}
	//	stu[100000];

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
				stu[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].c = tempVar4;
			}

		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((stu[j].b + stu[j].c) > (stu[i].b + stu[i].c))
				{
					y = stu[i].b;
					t = stu[i].c;
					m = stu[i].a;
					stu[i].b = stu[j].b;
					stu[j].b = y;
					stu[i].c = stu[j].c;
					stu[j].c = t;
					stu[i].a = stu[j].a;
					stu[j].a = m;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].a,(stu[i].b + stu[i].c));
		}
	}




}

