package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int grade1;
	//		int grade2;
	//		char jerk;
	//		char west;
	//		int paper;
	//	};
		student[] nerd = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int n;
		int i;
		int j;
		int[] blame = new int[100];
		int max = 0;
		int sin = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nerd[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nerd[i].grade1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				nerd[i].grade2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				nerd[i].jerk = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				nerd[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				nerd[i].paper = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (nerd[i].grade1 > 80 && nerd[i].paper >= 1)
			{
				blame[i] += 8000;
			}
			if (nerd[i].grade1 > 85 && nerd[i].grade2 > 80)
			{
				blame[i] += 4000;
			}
			if (nerd[i].grade1 > 90)
			{
				blame[i] += 2000;
			}
			if (nerd[i].grade1 > 85 && nerd[i].west == 'Y')
			{
				blame[i] += 1000;
			}
			if (nerd[i].grade2 > 80 && nerd[i].jerk == 'Y')
			{
				blame[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (blame[i] > max)
			{
				j = i;
				max = blame[i];
			}
			sin += blame[i];
		}
		System.out.printf("%s\n",nerd[j].name);
		System.out.printf("%d\n%d",max,sin);
		return 0;
	}
}

