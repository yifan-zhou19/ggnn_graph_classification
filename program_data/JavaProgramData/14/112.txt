package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		int number;
	//		int chinese;
	//		int math;
	//		int total;
	//	}
	//	student[100000],temp;

		int n;
		int i;
		int j;

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
				student[i].number = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].math = tempVar4;
			}
			student[i].total = student[i].chinese + student[i].math;
		}

		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (student[i].total < student[j].total)
				{
					temp.number = student[i].number;
					temp.chinese = student[i].chinese;
					temp.math = student[i].math;
					temp.total = student[i].total;

					student[i].number = student[j].number;
					student[i].chinese = student[j].chinese;
					student[i].math = student[j].math;
					student[i].total = student[j].total;

					student[j].number = temp.number;
					student[j].chinese = temp.chinese;
					student[j].math = temp.math;
					student[j].total = temp.total;
				}
			}
		}

		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",student[i].number,student[i].total);
		}

	}
}

