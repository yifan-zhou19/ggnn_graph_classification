package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student
	//	{
	//		int ID;
	//		int Chinese;
	//		int Math;
	//		int sum;
	//	}
	//	student[100000];
		int i;
		int j;
		int n;
		Student t = new Student();
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
				student[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].Chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].Math = tempVar4;
			}
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (student[i].Chinese + student[i].Math < student[j].Chinese + student[j].Math)
				{
					t = student[i];
					student[i] = student[j];
					student[j] = t;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",student[i].ID,student[i].Chinese + student[i].Math);
		}
		return 0;
	}

}

