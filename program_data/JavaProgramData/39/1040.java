package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int s;
		int max = 0;
		int n;
		int i;
		int a;
		int b;
		int e;
		String nm = new String(new char[20]);
		String nm0 = new String(new char[20]);
		String c = new String(new char[2]);
		String d = new String(new char[2]);
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
				nm = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				e = Integer.parseInt(tempVar7);
			}
			s = 0;
			if (a > 80 && e != 0)
			{
				s += 8000;
			}
			if (a > 85 && b > 80)
			{
				s += 4000;
			}
			if (a > 90)
			{
				s += 2000;
			}
			if (a > 85 && d.charAt(0) == 'Y')
			{
				s += 1000;
			}
			if (b > 80 && c.charAt(0) == 'Y')
			{
				s += 850;
			}
			sum += s;
			if (s > max)
			{
				nm0 = nm;
				max = s;
			}
		}
		System.out.printf("%s\n%d\n%d\n",nm0,max,sum);
		return 0;
	}
}

