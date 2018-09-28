package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int sum = 0;
		int i;
		int mon = 0;
		int max = 0;
		String name = new String(new char[20]);
		char c1;
		char c2;
		String maxname = new String(new char[20]);
		int m1;
		int m2;
		int m3;
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
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				m3 = Integer.parseInt(tempVar7);
			}
			mon = 0;
			if (m1 > 80 && m3 > 0)
			{
				mon += 8000;
			}
			if (m1 > 85 && m2 > 80)
			{
				mon += 4000;
			}
			if (m1 > 90)
			{
				mon += 2000;
			}
			if ('Y' == c2 && m1 > 85)
			{
				mon += 1000;
			}
			if ('Y' == c1 && m2 > 80)
			{
				mon += 850;
			}
		sum += mon;
		if (mon > max)
		{
		max = mon;
		maxname = name;
		}
		}
		System.out.printf("%s\n%d\n%d\n",maxname,max,sum);
	}
}

