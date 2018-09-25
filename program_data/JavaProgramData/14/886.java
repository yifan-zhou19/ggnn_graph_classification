package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int sum;
	//	}
	//	stu[100000],temp;
		int total;
		int i;
		int j;
		int chin;
		int math;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}
		for (i = 0;i < total;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				chin = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = chin + math;
		}
		for (i = 2;i < 5;i++)
		{
			for (j = total - i;j >= 0;j--)
			{
				if (stu[j].sum < stu[j + 1].sum)
				{
					temp = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
	}
}

