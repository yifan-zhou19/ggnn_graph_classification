public class student
{
	public String name = new String(new char[21]);
	public int term;
	public int access;
	public char ganbu;
	public char west;
	public int paper;
	public int all;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i;
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
				stu[i].term = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].access = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
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
		}
		for (i = 0;i < N;i++)
		{
			stu[i].all = 0;
			if (stu[i].term > 80 && stu[i].paper >= 1)
			{
				stu[i].all = stu[i].all + 8000;
			}
			if (stu[i].term > 85 && stu[i].access > 80)
			{
				stu[i].all = stu[i].all + 4000;
			}
			if (stu[i].term > 90)
			{
				stu[i].all = stu[i].all + 2000;
			}
			if (stu[i].term > 85 && stu[i].west == 'Y')
			{
				stu[i].all = stu[i].all + 1000;
			}
			if (stu[i].ganbu == 'Y' && stu[i].access > 80)
			{
				stu[i].all = stu[i].all + 850;
			}
		}
		int max = 0;
		int total = 0;
		int k;
		for (i = 0;i < N;i++)
		{
			total += stu[i].all;
			if (max < stu[i].all)
			{
				max = stu[i].all;
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].name,stu[k].all,total);
	}
}

