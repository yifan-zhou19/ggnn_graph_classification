package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int id;
	//		int x,y;
	//
	//
	//	}
	//	stu[100000];
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		int i;
		int N1;
		int N2;
		int N3;
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
				stu[i].x = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].y = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((stu[i].x + stu[i].y) > no1)
			{
				no2 = no1;
				no1 = (stu[i].x + stu[i].y);
				N2 = N1;
				N1 = i;
			}
			else if ((stu[i].x + stu[i].y) > no2)
			{
				no3 = no2;
				no2 = (stu[i].x + stu[i].y);
				N3 = N2;
				N2 = i;
			}
			else if ((stu[i].x + stu[i].y) > no3)
			{
				no3 = (stu[i].x + stu[i].y);
				N3 = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",stu[N1].id,(stu[N1].x + stu[N1].y),stu[N2].id,(stu[N2].x + stu[N2].y),stu[N3].id,(stu[N3].x + stu[N3].y));

	}


}

