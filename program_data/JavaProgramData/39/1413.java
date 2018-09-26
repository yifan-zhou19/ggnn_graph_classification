//?????????

public class student
{
	public String name = new String(new char[25]);
	public int score;
	public int cla;
	public char leader;
	public char west;
	public int paper;
}

public class scholar
{
	public String name = new String(new char[25]);
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static scholar scholar(student[] a, int n)
	{
		scholar[] num = tangible.Arrays.initializeWithDefaultscholarInstances(100);
		scholar p;
		int i;

		for (i = 0;i < n;i++)
		{
			num[i].money = 0;
			num[i].name = a[i].name;
		}
		p = num;

		for (i = 0;i < n;i++)
		{
			if (a[i].score > 80 && a[i].paper >= 1)
			{
				num[i].money += 8000;
			}
			if (a[i].score > 85 && a[i].cla > 80)
			{
				num[i].money += 4000;
			}
			if (a[i].score > 90)
			{
				num[i].money += 2000;
			}
			if (a[i].score > 85 && a[i].west == 'Y')
			{
				num[i].money += 1000;
			}
			if (a[i].cla > 80 && a[i].leader == 'Y')
			{
				num[i].money += 850;
			}
		}

		return (p);
	}

	public static void Main()
	{
		int n;
		int sum;
		int i;
		int m;
		int r;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		scholar p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i].name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i].score = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i].cla = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar5 != null)
				{
					a[i].leader = tempVar5.charAt(0);
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
			}
			else
			{
				String tempVar8 = ConsoleInput.scanfRead("\n");
				if (tempVar8 != null)
				{
					a[i].name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ");
				if (tempVar9 != null)
				{
					a[i].score = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					a[i].cla = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar11 != null)
				{
					a[i].leader = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar12 != null)
				{
					a[i].west = tempVar12.charAt(0);
				}
				String tempVar13 = ConsoleInput.scanfRead(" ");
				if (tempVar13 != null)
				{
					a[i].paper = Integer.parseInt(tempVar13);
				}
			}
		}

		p = new scholar(a,n);

		m = p.money;
		r = 0;
		sum = p.money;

		for (i = 1;i < n;i++)
		{
			sum += (p + i).money;
			if ((p + i).money > m)
			{
				r = i;
				m = (p + i).money;
			}
		}
		System.out.printf("%s\n%d\n%d\n",a[r].name,m,sum);
	}




}

