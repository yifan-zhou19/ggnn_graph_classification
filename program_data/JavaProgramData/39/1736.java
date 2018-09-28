package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char name[20];
	//	 int gpa;
	//	 int cgpa;
	//	 char official;
	//	 char west;
	//	 int paper;
	//	}
	//	stu[100];
		int[] m = new int[100];
		int n;
		int i;
		int max = 0;
		int num = 0;
		int sum = 0;
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].gpa = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].cgpa = tempVar4;
			}
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				stu[i].official = tempVar5;
			}
			System.in.read();
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			if (stu[i].gpa > 80 && stu[i].paper > 0)
			{
				m[i] = m[i] + 8000;
			}
			if (stu[i].gpa > 85 && stu[i].cgpa > 80)
			{
				m[i] = m[i] + 4000;
			}
			if (stu[i].gpa > 90)
			{
				m[i] = m[i] + 2000;
			}
			if (stu[i].gpa > 85 && stu[i].west == 'Y')
			{
				m[i] = m[i] + 1000;
			}
			if (stu[i].cgpa > 80 && stu[i].official == 'Y')
			{
				m[i] = m[i] + 850;
			}
			sum = sum + m[i];
			if (m[i] > max)
			{
				max = m[i];
				num = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[num].name,max,sum);
	}
}

