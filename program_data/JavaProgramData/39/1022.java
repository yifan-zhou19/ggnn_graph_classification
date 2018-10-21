public class studen
{
	public String name = new String(new char[100]);
	public int score1;
	public int score2;
	public char H;
	public char W;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static studen[] stu = tangible.Arrays.initializeWithDefaultstudenInstances(200);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int money = 0;
		int student;
		int scholar = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].H = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].W = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			stu[i].money = 0;
			if (stu[i].score1 > 80 && stu[i].paper > 0)
			{
				stu[i].money += 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].score1 > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].score1 > 85 && stu[i].W == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].score2 > 80 && stu[i].H == 'Y')
			{
				stu[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].money > money)
			{
				student = i;
				money = stu[i].money;
			}
			scholar = scholar + stu[i].money;
		}
			System.out.printf("%s\n%d\n%d\n",stu[student].name,stu[student].money,scholar);
		return 0;
	}








}

