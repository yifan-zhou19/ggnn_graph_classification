package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//
	//	 int id;
	//	 int chi;
	//	 int mat;
	//	 int sum;
	//	}
	//	stu[100000],t;
		int i;
		int j;
		int n;
		int student_num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			student_num = Integer.parseInt(tempVar);
		}
		n = student_num;
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
				stu[i].chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].mat = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].sum = stu[i].chi + stu[i].mat;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[0].sum < stu[i].sum)
			{
					t = stu[0];
					stu[0] = stu[i];
					stu[i] = t;
			}
		}
			for (i = 1;i < n;i++)
			{
			if (stu[1].sum < stu[i].sum)
			{
					t = stu[1];
					stu[1] = stu[i];
					stu[i] = t;
			}
			}
			for (i = 2;i < n;i++)
			{
			if (stu[2].sum < stu[i].sum)
			{
					t = stu[2];
					stu[2] = stu[i];
					stu[i] = t;
			}
			}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].id,stu[i].sum);
		}
	}


}

