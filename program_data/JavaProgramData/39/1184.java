public class student
{
	public String name = new String(new char[25]);
	public int qi_g;
	public int bang_g;
	public char gb;
	public char xb;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int comp_money(student s)
	{
		int sum = 0;
		if ((s.qi_g > 80) && (s.paper >= 1))
		{
			sum += 8000;
		}
		if ((s.qi_g > 85) && (s.bang_g > 80))
		{
			sum += 4000;
		}
		if (s.qi_g > 90)
		{
			sum += 2000;
		}
		if ((s.qi_g > 85) && (s.xb == 'Y'))
		{
			sum += 1000;
		}
		if ((s.bang_g > 80) && (s.gb == 'Y'))
		{
			sum += 850;
		}
		/*printf("%s %d %d %c %c %d %d\n", s.name, s.qi_g, s.bang_g, s.gb, s.xb, s.paper, sum);*/

		return sum;
	}

	public static int Main()
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(LEN);
		int n;
		int i;
		int sum;
		int max;
		int max_i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].qi_g = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].bang_g = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = Integer.parseInt(tempVar7);
			}
			a[i].money = comp_money(a[i]);

		}

		sum = max = a[0].money;
		max_i = 0;
		for (i = 1; i < n; i++)
		{
			if (a[i].money > max)
			{
				max = a[i].money;
				max_i = i;
			}
			sum += a[i].money;
		}

		System.out.printf("%s\n", a[max_i].name);
		System.out.printf("%d\n", a[max_i].money);
		System.out.printf("%d\n", sum);

		return 0;
	}

}

