public class student
{
	public String name = new String(new char[20]);
	public int score;
	public int pscore;
	public char gjud;
	public char wjud;
	public int paper;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int ssum = 0;
		int tsum = 0;
		int ti;
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
				stu[i].score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].pscore = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gjud = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].wjud = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].score > 80 && stu[i].paper >= 1)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].score > 85 && stu[i].pscore > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].score > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].score > 85 && stu[i].wjud == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].pscore > 80 && stu[i].gjud == 'Y')
			{
				stu[i].sum += 850;
			}
			ssum += stu[i].sum;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > tsum)
			{
				tsum = stu[i].sum,ti = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[ti].name,tsum,ssum);
	}




}

