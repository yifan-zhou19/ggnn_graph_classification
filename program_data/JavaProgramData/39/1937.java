public class profile
{
	public String name = new String(new char[20]);
	public int grade;
	public int approval;
	public char west;
	public char manager;
	public int paper;
	public int prize;
}

package <missing>;

public class GlobalMembers
{
	public static int prizetoget(int gra,int app,char w,char ma,int pa)
	{
		int initial = 0;
		if ((pa >= 1) && (gra > 80))
		{
			initial += Principal;
		}
		if ((gra > 85) && (app > 80))
		{
			initial += Wusi;
		}
		if (gra > 90)
		{
			initial += Highmark;
		}
		if ((gra > 85) && (w == 'Y'))
		{
			initial += Western;
		}
		if ((app > 80) && (ma == 'Y'))
		{
			initial += Devotion;
		}
		return initial;
	}

	public static int Main()
	{
		profile[] student = tangible.Arrays.initializeWithDefaultprofileInstances(100);
		int n;
		int i;
		int most = 0;
		int No;
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
				student[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].grade = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].approval = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].manager = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				student[i].paper = Integer.parseInt(tempVar7);
			}
			student[i].prize = prizetoget(student[i].grade, student[i].approval, student[i].west, student[i].manager, student[i].paper);
			sum += student[i].prize;
		}

		for (i = 0;i < n;i++)
		{
			if (student[i].prize > most)
			{
				most = student[i].prize;
				No = i;
			}
		}

		System.out.printf("%s\n%d\n%d",student[No].name,most,sum);
		return 0;
	}

}

