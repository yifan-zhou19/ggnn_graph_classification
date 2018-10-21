public class students
{
	public String name = new String(new char[21]);
	public int S1;
	public int S2;
	public char T1;
	public char T2;
	public int P;
	public int JJ;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		students[] stu = tangible.Arrays.initializeWithDefaultstudentsInstances(NUM);
		int all;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].S1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].S2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].T1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].T2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].P = Integer.parseInt(tempVar7);
			}
		}
		all = 0;
		for (i = 0;i < n;i++)
		{
			stu[i].JJ = 0;
			if ((stu[i].S1 > 80) && (stu[i].P >= 1))
			{
				stu[i].JJ += 8000;
			}
			if ((stu[i].S1 > 85) && (stu[i].S2 > 80))
			{
				stu[i].JJ += 4000;
			}
			if (stu[i].S1 > 90)
			{
				stu[i].JJ += 2000;
			}
			if ((stu[i].S1 > 85) && (stu[i].T2 == 'Y'))
			{
				stu[i].JJ += 1000;
			}
			if ((stu[i].S2 > 80) && (stu[i].T1 == 'Y'))
			{
				stu[i].JJ += 850;
			}
			all = all + stu[i].JJ;
		}
		max = 0;
		for (i = 1;i < n;i++)
		{
			if (stu[i].JJ > stu[max].JJ)
			{
				max = i;
			}
		}
		System.out.printf("%s\n%d\n%ld\n",stu[max].name,stu[max].JJ,all);
	}

}

