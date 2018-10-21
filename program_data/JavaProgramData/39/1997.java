public class student
{
	public int num;
	public String name = new String(new char[20]);
	public int qimo;
	public int pingyi;
	public char ganbu;
	public char west;
	public int paper;
}
public class jiangxuejin
{
	public int num;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int all = 0;
		student[] list = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		student most = new student();
		jiangxuejin[] everyone = tangible.Arrays.initializeWithDefaultjiangxuejinInstances(100);
		jiangxuejin check = new jiangxuejin();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			list[i].num = i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				list[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				list[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				list[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				list[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				list[i].paper = Integer.parseInt(tempVar7);
			}
		}

		for (i = 0;i < n;i++)
		{
			everyone[i].num = i;
			everyone[i].total = 0;
			if (list[i].qimo > 80 && list[i].paper >= 1)
			{
				everyone[i].total += 8000;
			}
			if (list[i].qimo > 85 && list[i].pingyi > 80)
			{
				everyone[i].total += 4000;
			}
			if (list[i].qimo > 90)
			{
				everyone[i].total += 2000;
			}
			if (list[i].qimo > 85 && list[i].west == 'Y')
			{
				everyone[i].total += 1000;
			}
			if (list[i].pingyi > 80 && list[i].ganbu == 'Y')
			{
				everyone[i].total += 850;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: most=list[0];
		most.copyFrom(list[0]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: check=everyone[0];
		check.copyFrom(everyone[0]);

		for (i = 1;i < n;i++)
		{
			if (everyone[i].total > check.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: most=list[i];
				most.copyFrom(list[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: check=everyone[i];
				check.copyFrom(everyone[i]);
			}
		}

		for (i = 0;i < n;i++)
		{
			all += everyone[i].total;
		}

		System.out.printf("%s\n%d\n%d",most.name,check.total,all);
		return 0;
	}








}

