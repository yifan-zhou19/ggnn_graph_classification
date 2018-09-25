package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int a;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0))
		{
			a = 29;
		}
		else
		{
			a = 28;
		}
		if (m == 1)
		{
			s = d;
		}
		else if (m == 2)
		{
			s = 31 + d;
		}
		else if (m == 3)
		{
			s = 31 + a + d;
		}
		else if (m == 4)
		{
			s = 31 * 2 + a + d;
		}
		else if (m == 5)
		{
			s = 31 * 2 + a + 30 + d;
		}
		else if (m == 6)
		{
			s = 31 * 3 + a + d + 30;
		}
		else if (m == 7)
		{
			s = 31 * 3 + a + d + 30 * 2;
		}
		else if (m == 8)
		{
			s = 31 * 4 + a + d + 30 * 2;
		}
		else if (m == 9)
		{
			s = 31 * 5 + a + d + 30 * 2;
		}
		else if (m == 10)
		{
			s = 31 * 5 + a + d + 30 * 3;
		}
		else if (m == 11)
		{
			s = 31 * 6 + a + d + 30 * 3;
		}
		else if (m == 12)
		{
			s = 31 * 6 + a + d + 30 * 4;
		}
		else
		{
			;
		}
		System.out.printf("%d\n",s);
		return 0;
	}

}

