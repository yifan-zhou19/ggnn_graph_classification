public class Student
{
	public String name = new String(new char[21]);
	public int grade;
	public int eval;
	public char clasAsi;
	public char west;
	public int essay;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int totalMoney = 0;
		int money = 0;
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].grade = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu [i].eval = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].clasAsi = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].essay = Integer.parseInt(tempVar7);
			}
			stu[i].total = 0;
			if (stu[i].grade > 80 && stu[i].essay > 0)
			{
				stu[i].total = stu[i].total + 8000;
			}
			if (stu[i].grade > 85 && stu[i].eval > 80)
			{
				stu[i].total = stu[i].total + 4000;
			}
			if (stu[i].grade > 90)
			{
				stu[i].total = stu[i].total + 2000;
			}
			if (stu[i].grade > 85 && stu[i].west == 'Y')
			{
				stu[i].total = stu[i].total + 1000;
			}
			if (stu[i].eval > 80 && stu[i].clasAsi == 'Y')
			{
				stu[i].total = stu[i].total + 850;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (stu[i].total > money)
			{
				money = stu[i].total;
			}
			totalMoney = totalMoney + stu[i].total;
		}
		for (i = 0; i < n; i++)
		{
			if (stu[i].total == money)
			{
				System.out.printf("%s\n%d\n",stu[i].name,money);
				break;
			}
		}
		System.out.printf("%d",totalMoney);
		return 0;
	}
}

