public class asd
{
	public String str = new String(new char[21]);
	public int a;
	public int b;
	public int c;
	public int sum;
	public char x;
	public char y;
}

package <missing>;

public class GlobalMembers
{
	public static asd[] stu = tangible.Arrays.initializeWithDefaultasdInstances(100);

	public static void Main()
	{
		int i;
		int n;
		int max;
		int m;
		int t;
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
				stu[i].str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].y = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].c = Integer.parseInt(tempVar7);
			}
			stu[i].sum = 0;
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].a > 80 && stu[i].c > 0)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].a > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].a > 85 && stu[i].y == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].b > 80 && stu[i].x == 'Y')
			{
				stu[i].sum += 850;
			}
		}

		m = 0;
		for (i = 0;i < n;i++)
		{
			m += stu[i].sum;
		}

		max = 0;
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > max)
			{
				max = stu[i].sum;
				t = i;
			}
		}

		System.out.printf("%s\n%d\n%d\n", stu[t].str, max, m);
	}
}

