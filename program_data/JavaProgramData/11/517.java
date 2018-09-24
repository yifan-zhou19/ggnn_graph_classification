package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int D = 0;
		int l;
		int s;
		l = 31;
		s = 30;
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
		if (m == 1)
		{
			D = d;
		}
		else if (m == 2)
		{
			D = l + d;
		}
		else if (m == 3)
		{
			D = l + 28 + d;
		}
		else if (m == 4)
		{
			D = l * 2 + 28 + d;
		}
		else if (m == 5)
		{
			D = l * 2 + 28 + d + s;
		}
		else if (m == 6)
		{
			D = s + l * 3 + 28 + d;
		}
		else if (m == 7)
		{
			D = s * 2 + l * 3 + 28 + d;
		}
		else if (m == 8)
		{
			D = s * 2 + l * 4 + 28 + d;
		}
		else if (m == 9)
		{
			D = s * 2 + l * 5 + 28 + d;
		}
		else if (m == 10)
		{
			D = s * 3 + l * 5 + 28 + d;
		}
		else if (m == 11)
		{
			D = s * 3 + l * 6 + 28 + d;
		}
		else
		{
			D = s * 4 + l * 6 + 28 + d;
		}
		if (m > 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)))
		{
			D = D + 1;
		}
		System.out.printf("%d\n", D);
		return 0;
	}


}

