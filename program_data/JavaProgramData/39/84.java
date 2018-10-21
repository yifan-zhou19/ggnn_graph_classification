public class student
{
	public String name = new String(new char[30]);
 public int score1;
 public int score2;
 public String ganbu = new String(new char[1]);
 public String xibu = new String(new char[1]);
 public int lunwen;
 public int s;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int N;
		int i;
		int max = 0;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
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
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			stu[i].s = 0;
		}
		for (i = 0;i < N;i++)
		{
			if (stu[i].score1 > 80 && stu[i].lunwen > 0)
			{
				stu[i].s = stu[i].s + 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
				stu[i].s = stu[i].s + 4000;
			}
			if (stu[i].score1 > 90)
			{
				stu[i].s = stu[i].s + 2000;
			}
			if (stu[i].score1 > 85 && stu[i].xibu.charAt(0) == 'Y')
			{
				stu[i].s = stu[i].s + 1000;
			}
			if (stu[i].score2 > 80 && stu[i].ganbu.charAt(0) == 'Y')
			{
				stu[i].s = stu[i].s + 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (stu[i].s > max)
			{
				max = stu[i].s;
				j = i;
			}
			sum = sum + stu[i].s;
		}
		System.out.printf("%s\n",stu[j].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);


	}

}

