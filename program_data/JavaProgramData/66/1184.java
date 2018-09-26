package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int A;
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
		int wee = 0;
		A = a - 1;
		wee = A + A / 4 - (A - (A % 100)) / 100 + (A - (A % 100)) / 400;
		for (j = 1;j <= b - 1;j++)
		{
		if (j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12 || j == 1)
		{
			wee += 31;
		}
		else
		{
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				wee += 30;
			}
			else
			{
				if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
				{
				wee += 28;
				}
				else
				{
					wee += 29;
				}
			}
		}
		}

		wee += c;

		int s;
		s = wee % 7;
		if (s == 1)
		{
			System.out.print("Mon.");
		}
		if (s == 2)
		{
			System.out.print("Tue.");
		}
		if (s == 3)
		{
			System.out.print("Wed.");
		}
		if (s == 4)
		{
			System.out.print("Thu.");
		}
		if (s == 5)
		{
			System.out.print("Fri.");
		}
		if (s == 6)
		{
			System.out.print("Sat.");
		}
		if (s == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

