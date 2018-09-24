package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	int No;
	//	int chinese;
	//	int math;
	//	int total;
	//}
	//stu[100000];
		int i;
		int j;
		int x;
		int y;
		int z;
		int n;
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
				stu[i].No = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
			stu[i].total = stu[i].chinese + stu[i].math;
		}
		for (j = 0;j < 3;j++)
		{
		x = 0;
		for (i = 0;i < n;i++)
		{
				if (stu[i].total > x)
				{
					x = stu[i].total;
					y = stu[i].No;
					z = i;
				}
		}
		System.out.printf("%d %d\n",y,x);
		stu[z].total = 0;
		}
	}

}

