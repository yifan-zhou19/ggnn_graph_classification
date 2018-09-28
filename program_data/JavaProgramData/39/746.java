package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int mark1;
	//		int mark2;
	//		char ganbu;
	//		char xibu;
	//		int lunwen;
	//		int total;
	//	}
	//	student[100],temp,Total;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Total.total = 0;
		for (i = 0;i < n;i++)
		{
			student[i].total = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].mark1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].mark2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[i].lunwen = tempVar7;
			}
			if (student[i].mark1 > 80 && student[i].lunwen > 0)
			{
				student[i].total += 8000;
			}
			if (student[i].mark1 > 85 && student[i].mark2 > 80)
			{
				student[i].total += 4000;
			}
			if (student[i].mark1 > 90)
			{
				student[i].total += 2000;
			}
			if (student[i].mark1 > 85 && student[i].xibu == 'Y')
			{
				student[i].total += 1000;
			}
			if (student[i].mark2 > 80 && student[i].ganbu == 'Y')
			{
				student[i].total += 850;
			}
			Total.total += student[i].total;
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
			if (student[i].total >= student[i + 1].total)
			{
				temp = student[i];
				student[i] = student[i + 1];
				student[i + 1] = temp;
			}
			}
		}

		System.out.printf("%s\n%d\n%d\n",student[n - 1].name,student[n - 1].total,Total.total);
	}
}

