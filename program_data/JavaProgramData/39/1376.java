public class student
{
	public String name = new String(new char[20]);
	public int final;
	public int pingyi;
	public char leader;
	public char wester;
	public int essay;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(200);
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int prize;
		int max = 0;
		int k = 0;
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
				stu[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].wester = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].essay = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			prize = 0;
			if (stu[i].final > 80 && stu[i].essay >= 1)
			{
				prize += 8000;
				sum += 8000;
			}
			if (stu[i].final > 85 && stu[i].pingyi > 80)
			{
				prize += 4000;
				sum += 4000;
			}
			if (stu[i].final > 90)
			{
				prize += 2000;
				sum += 2000;
			}
			if (stu[i].final > 85 && stu[i].wester == 'Y')
			{
				prize += 1000;
				sum += 1000;
			}
			if (stu[i].pingyi > 80 && stu[i].leader == 'Y')
			{
				prize += 850;
				sum += 850;
			}
			if (prize > max)
			{
				max = prize;
				k = i;
			}
		}
		System.out.printf("%s\n",stu[k].name);
		System.out.printf("%d\n%d\n",max,sum);
	}
}

