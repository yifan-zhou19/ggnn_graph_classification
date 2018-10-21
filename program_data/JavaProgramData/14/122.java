package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	int num;
	//	int chi;
	//	int math;
	//	int sum;
	//}
	//stu[100000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
			stu[i].sum = stu[i].chi + stu[i].math;
		}
		student blank = new student();
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > stu[0].sum)
			{
				blank = stu[0];
				stu[0] = stu[i];
				stu[i] = blank;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum > stu[1].sum)
			{
				blank = stu[1];
				stu[1] = stu[i];
				stu[i] = blank;
			}
		}
		for (i = 2;i < n;i++)
		{
			if (stu[i].sum > stu[2].sum)
			{
				blank = stu[2];
				stu[2] = stu[i];
				stu[i] = blank;
			}
		}
		for (i = 0;i <= 2;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
	}















}

