public class award
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char leader;
	public char west;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		award[] stu = tangible.Arrays.initializeWithDefaultawardInstances(100);
		award max = new award();
		int n;
		int i;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
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
			if (stu[i].score1 > 85 && stu[i].west == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].score2 > 80 && stu[i].leader == 'Y')
			{
				stu[i].money += 850;
			}
			sum += stu[i].money;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=stu[0];
		max.copyFrom(stu[0]);
		for (i = 1;i < n;i++)
		{
			if (stu[i].money > max.money)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=stu[i];
				max.copyFrom(stu[i]);
			}
		}
		System.out.println(max.name);
		System.out.printf("%d\n",max.money);
		System.out.printf("%d\n",sum);
		return 0;
	}
}

