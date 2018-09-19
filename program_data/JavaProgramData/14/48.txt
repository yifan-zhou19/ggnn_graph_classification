package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int num;
	//		int chinese;
	//		int maths;
	//		int all;
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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].maths = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].all = stu[i].chinese + stu[i].maths;
		}

		for (k = 0;k < 3;k++)
		{
			max = stu[0].all;
			for (i = 0;i < n;i++)
			{
			   if (stu[i].all > max)
			   {
				max = stu[i].all;
				j = i;
			   }
			}

		System.out.printf("%d %d\n",stu[j].num,stu[j].all);
		stu[j].all = 0;
		}
	}





}

