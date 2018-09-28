public class student
{
	public String name = new String(new char[20]);
	public int final;
	public int cla;
	public char west;
	public char cadre;
	public int eas;
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
		int all = 0;
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
				stu[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].cadre = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].eas = Integer.parseInt(tempVar7);
			}
			if ((stu[i].final > 80) && (stu[i].eas >= 1))
			{
				stu[i].sum = stu[i].sum + 8000;
			}
			if ((stu[i].final > 85) && (stu[i].cla > 80))
			{
				stu[i].sum = stu[i].sum + 4000;
			}
			if (stu[i].final > 90)
			{
				stu[i].sum = stu[i].sum + 2000;
			}
			if ((stu[i].final > 85) && (stu[i].west == 'Y'))
			{
				stu[i].sum = stu[i].sum + 1000;
			}
			if ((stu[i].cla > 80) && (stu[i].cadre == 'Y'))
			{
				stu[i].sum = stu[i].sum + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			all = all + stu[i].sum;
		}
		int most = 0;
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum > stu[most].sum)
			{
			most = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[most].name,stu[most].sum,all);
	}
}

