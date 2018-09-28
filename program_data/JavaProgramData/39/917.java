public class file
{
	public String name = new String(new char[50]);
	public int exam;
	public int judge;
	public char worker;
	public char west;
	public int paper;
	public int scholarship;
}

package <missing>;

public class GlobalMembers
{
	public static int yuanshi(int exam,int paper)
	{
		if (exam > 80 && paper >= 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int wusi(int exam,int judge)
	{
		if (exam > 85 && judge > 80)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int chengji(int exam)
	{
		if (exam > 90)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int xibu(int exam,char west)
	{
		if (exam > 85 && west == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int banji(int judge,char worker)
	{
		if (judge > 80 && worker == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		file[] a = tangible.Arrays.initializeWithDefaultfileInstances(110);
		int i;
		int n;
		int sum = 0;
		int max = 0;
		int orient;
		for (i = 1;i <= 110;i++)
		{
			a[i - 1].scholarship = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].exam = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].judge = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].worker = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = Integer.parseInt(tempVar7);
			}
			if (yuanshi(a[i].exam, a[i].paper) != 0)
			{
				a[i].scholarship += 8000;
			}
			if (wusi(a[i].exam, a[i].judge) != 0)
			{
				a[i].scholarship += 4000;
			}
			if (chengji(a[i].exam) != 0)
			{
				a[i].scholarship += 2000;
			}
			if (xibu(a[i].exam, a[i].west) != 0)
			{
				a[i].scholarship += 1000;
			}
			if (banji(a[i].judge, a[i].worker) != 0)
			{
				a[i].scholarship += 850;
			}
			sum += a[i].scholarship;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i].scholarship > max)
			{
				max = a[i].scholarship;
				orient = i;
			}
		}
		System.out.printf("%s\n%d\n%d",a[orient].name,max,sum);
	}
}

