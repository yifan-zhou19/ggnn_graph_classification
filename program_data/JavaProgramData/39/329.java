public class student
{
	public String name = new String(new char[30]);
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(999);

	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int max = 0;
		int grade_1;
		int grade_2;
		int paper;
		char a;
		char b;
		String winner;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				grade_1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				grade_2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				paper = Integer.parseInt(tempVar7);
			}
			stu[i].money = 0;
			if (grade_1 > 80 && paper > 0)
			{
				stu[i].money += 8000;
			}
			if (grade_1 > 85 && grade_2 > 80)
			{
				stu[i].money += 4000;
			}
			if (grade_1 > 90)
			{
				stu[i].money += 2000;
			}
			if (grade_1 > 85 && b == 'Y')
			{
				stu[i].money += 1000;
			}
			if (grade_2 > 80 && a == 'Y')
			{
				stu[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += stu[i].money;
			if (max < stu[i].money)
			{
				max = stu[i].money;
				winner = stu[i].name;
			}
		}
		System.out.printf("%s\n%d\n%d",winner,max,sum);
	}

}

