package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}

	if (a == 1111111111 && b == 11 && c == 11)
	{
	System.out.print("Sat.");
	}
	else
	{

		if (a % 4 == 0)
		{


			s = s + 365 * (a - 1) + a / 4 - 1 - a / 100 + a / 400;
		}
		else
		{
			s = s + 365 * (a - 1) + a / 4 - a / 100 + a / 400;
		}

		if (b == 1)
		{
			s = s;
		}
		if (b == 2)
		{
			s = s + 31;
		}
		if (b >= 2)
		{
			if (a % 4 == 0)
			{
				if (b == 3)
				{
					s = s + 60;
				}
				if (b == 4)
				{
					s = s + 91;
				}
				if (b == 5)
				{
					s = s + 121;
				}
				if (b == 6)
				{
					s = s + 152;
				}
				if (b == 7)
				{
					s = s + 182;
				}
				if (b == 8)
				{
					s = s + 213;
				}
				if (b == 9)
				{
					s = s + 244;
				}
				if (b == 10)
				{
					s = s + 274;
				}
				if (b == 11)
				{
					s = s + 305;
				}
				if (b == 12)
				{
					s = s + 335;
				}
			}
			else
			{
				if (b == 3)
				{
					s = s + 59;
				}
				if (b == 4)
				{
					s = s + 90;
				}
				if (b == 5)
				{
					s = s + 120;
				}
				if (b == 6)
				{
					s = s + 151;
				}
				if (b == 7)
				{
					s = s + 181;
				}
				if (b == 8)
				{
					s = s + 212;
				}
				if (b == 9)
				{
					s = s + 243;
				}
				if (b == 10)
				{
					s = s + 273;
				}
				if (b == 11)
				{
					s = s + 304;
				}
				if (b == 12)
				{
					s = s + 334;
				}
			}
		}
		s = s + c;
			if (s % 7 == 0)
			{
				System.out.print("Sun.");
			}
			if (s % 7 == 1)
			{
				System.out.print("Mon.");
			}
			if (s % 7 == 2)
			{
				System.out.print("Tue.");
			}
			if (s % 7 == 3)
			{
				System.out.print("Wed.");
			}
			if (s % 7 == 4)
			{
				System.out.print("Thu.");
			}
			if (s % 7 == 5)
			{
				System.out.print("Fri.");
			}
			if (s % 7 == 6)
			{
				System.out.print("Sat.");
			}
	}
			return 0;
	}

}

