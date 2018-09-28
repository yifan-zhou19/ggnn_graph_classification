public class stu
{
	public String name = new String(new char[21]);
	public int final;
	public int pingyi;
	public char leader;
	public char west;
	public int essay;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yuanshi = struct stu s;
		int wusi = struct stu s;
		int score = struct stu s;
		int western = struct stu s;
		int contribution = struct stu s;
		int n;
		int i;
		int sum = 0;
		int max;
		stu[] s = tangible.Arrays.initializeWithDefaultstuInstances(101);
		stu boss = new stu();
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
				s[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i].essay = Integer.parseInt(tempVar7);
			}
			s[i].total = 0;
			if (yuanshi(s[i]) != 0)
			{
				s[i].total += 8000;
			}
			if (wusi(s[i]) != 0)
			{
				s[i].total += 4000;
			}
			if (score(s[i]) != 0)
			{
				s[i].total += 2000;
			}
			if (western(s[i]) != 0)
			{
				s[i].total += 1000;
			}
			if (contribution(s[i]) != 0)
			{
				s[i].total += 850;
			}
		}
		max = s[0].total;
		for (i = 0;i < n;i++)
		{
			if (max < s[i].total)
			{
				max = s[i].total;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: boss=s[i];
				boss.copyFrom(s[i]);

			}
			sum += s[i].total;
		}
		System.out.printf("%s\n%d\n%d\n",boss.name,boss.total,sum);
		return 0;
	}

	public static int yuanshi(stu s)
	{
		if ((s.final > 80) && (s.essay >= 1))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int wusi(stu s)
	{
		if ((s.final > 85) && (s.pingyi > 80))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int score(stu s)
	{
		if (s.final > 90)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int western(stu s)
	{
		if ((s.final > 85) && (s.west == 'Y'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int contribution(stu s)
	{
		if ((s.pingyi > 80) && (s.leader == 'Y'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

