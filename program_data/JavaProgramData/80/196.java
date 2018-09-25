package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int s1;
		int s2;
		int s;
		int x1;
		int x2;
		int[] z = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		x1 = y1 % 2800 - 1;
		s1 = x1 * 365 + z[m1] + y1 / 4 + x1 / 400 - y1 / 100 + d1;
		x2 = y2 % 2800 - 1;
		s2 = x2 * 365 + z[m2] + y2 / 4 + x2 / 400 - y2 / 100 + d2;
		if (y1 % 4 == 0)
		{
			s = s2 - s1 + 1;
		}
		else
		{
			s = s2 - s1;
		}
		System.out.printf("%d",s);





		return 0;
	}
}

