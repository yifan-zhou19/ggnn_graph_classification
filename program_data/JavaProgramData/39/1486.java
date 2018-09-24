public class student
{
	public String name = new String(new char[21]);
	public int score;
	public int point;
	public String s1 = new String(new char[2]);
	public String s2 = new String(new char[2]);
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int total = 0;
		int[] t = new int[100];
		int max = 0;
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
				stu[i].point = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].s1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[i].s2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].score > 80)
			{
				if (stu[i].paper != 0)
				{
					t[i] += 8000;
				}
				if (stu[i].score > 85 && stu[i].point > 80)
				{
					t[i] += 4000;
				}
				if (stu[i].score > 85 && stu[i].s2.charAt(0) == 'Y')
				{
					t[i] += 1000;
				}
				if (stu[i].score > 90)
				{
					t[i] += 2000;
				}
			}
			if (stu[i].point > 80 && stu[i].s1.charAt(0) == 'Y')
			{
					t[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			max = max > t[i] != 0?max:t[i];
		}
		for (i = 0;i < n;i++)
		{
			if (max == t[i])
			{
				System.out.printf("%s\n%d\n",stu[i].name,max);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			total += t[i];
		}
			System.out.printf("%d\n",total);
	}

}

