public class student
{
	public String name = new String(new char[20]);
	public int final;
	public int cla;
	public char job;
	public char west;
	public int essay;
	public int bonus;
}

package <missing>;

public class GlobalMembers
{
	public static int sco1(student a)
	{
		if (a.final > 80 && a.essay > 0)
		{
			return 8000;
		}
		else
		{
			return 0;
		}
	}
	public static int sco2(student a)
	{
		if (a.final > 85 && a.cla > 80)
		{
			return 4000;
		}
		else
		{
			return 0;
		}
	}
	public static int sco3(student a)
	{
		if (a.final > 90)
		{
			return 2000;
		}
		else
		{
			return 0;
		}
	}
	public static int sco4(student a)
	{
		if (a.final > 85 && a.west == 'Y')
		{
			return 1000;
		}
		else
		{
			return 0;
		}
	}
	public static int sco5(student a)
	{
		if (a.cla > 80 && a.job == 'Y')
		{
			return 850;
		}
		else
		{
			return 0;
		}
	}
	public static void bubble(student[] p, int n)
	{
		int i;
		int j;
		student t = new student();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (p[j].bonus < p[j + 1].bonus)
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int total = 0;
		student[] stu =
		{
			new student(0, 0, 0, 0, 0, 0, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		};
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
				stu[i].job = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].essay = Integer.parseInt(tempVar7);
			}
			stu[i].bonus = sco1(stu[i]) + sco2(stu[i]) + sco3(stu[i]) + sco4(stu[i]) + sco5(stu[i]);
			total = total + stu[i].bonus;
		}
		bubble(stu, n);
		System.out.printf("%s\n%d\n%d",stu[0].name,stu[0].bonus,total);
	}
}

