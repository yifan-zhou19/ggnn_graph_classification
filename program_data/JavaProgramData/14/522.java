package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID;
	//		int mark1;
	//		int mark2;
	//		int total;
	//	}
	//	student[100000],temp;
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[k].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[k].mark1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[k].mark2 = tempVar4;
			}
			student[k].total = student[k].mark1 + student[k].mark2;
		}
		for (m = 0;m < 3;m++)
		{
		for (k = n - 1;k >= m;k--)
		{
			if (student[k].total > student[k - 1].total)
			{
				temp = student[k - 1];
				student[k - 1] = student[k];
				student[k] = temp;
			}
		}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",student[0].ID,student[0].total,student[1].ID,student[1].total,student[2].ID,student[2].total);
	}
}

