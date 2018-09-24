package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
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
		if (m == 1)
		{
			s = d;
		}
		else if (m == 2)
		{
			s = d + 31;
		}
		else if (m == 3)
		{
			s = d + 59;
		}
		else if (m == 4)
		{
			s = d + 90;
		}
		else if (m == 5)
		{
			s = d + 120;
		}
		else if (m == 6)
		{
			s = d + 151;
		}
		else if (m == 7)
		{
			s = d + 181;
		}
		else if (m == 8)
		{
			s = d + 212;
		}
		else if (m == 9)
		{
			s = d + 243;
		}
		else if (m == 10)
		{
			s = d + 273;
		}
		else if (m == 11)
		{
			s = d + 304;
		}
		else
		{
			s = d + 334;
		}
		if (!((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)))
		{
			System.out.printf("%d",s);
		}
		else
		{
			if (m < 3)
			{
				System.out.printf("%d",s);
			}
			else
			{
				System.out.printf("%d",s + 1);
			}
		}
		return 0;
	}
}

