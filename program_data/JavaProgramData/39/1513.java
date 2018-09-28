public class student
{
	public int avescore;
	public int classscore;
	public int paper;
	public int money;
	public String name = new String(new char[21]);
	public String lead = new String(new char[2]);
	public String west = new String(new char[2]);
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int money = 0;
		String output = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].avescore = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].classscore = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].lead = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			if (stu[i].avescore > 80 && stu[i].paper >= 1)
			{
				stu[i].money += 8000;
			}
			if (stu[i].avescore > 85 && stu[i].classscore > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].avescore > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].avescore > 85 && stu[i].west.charAt(0) == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].classscore > 80 && stu[i].lead.charAt(0) == 'Y')
			{
				stu[i].money += 850;
			}
			money += stu[i].money;
			if (max < stu[i].money)
			{
				max = stu[i].money;
				output = stu[i].name;
			}
		}
		System.out.printf("%s\n%d\n%d\n",output,max,money);
		return 0;
	}
}

