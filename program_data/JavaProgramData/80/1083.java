package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] date1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] date2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		int result;

		int x1;
		int sumshou = 0;
		if (b != 12)
		{
			for (x1 = b + 1;x1 <= 12;x1++)
			{
			  sumshou += date1[x1 - 1];
			}

			if (b == 1)
			{
				sumshou += 31 - c;
				if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				{
					sumshou += 1;
				}
			}
			if (b == 3 || b == 5 || b == 7 || b == 8 || b == 10)
			{
				sumshou += 31 - c;
			}
			if (b == 4 || b == 6 || b == 9 || b == 11)
			{
				sumshou += 30 - c;
			}
			if (b == 2)
			{
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				sumshou += 30 - c;
			}
			else
			{
				sumshou += 28 - c;
			}
			}
		}
		else
		{
			sumshou += 31 - c;
		}
		sumshou = sumshou;


		int x2;
		int sumwei = 0;
		if (e == 1)
		{
			sumwei = f;
		}
		if (e == 2)
		{
			sumwei = 31 + f;
		}
		else if (e != 1 && e != 2)
		{
			if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
			{
				for (x2 = e-1;x2 >= 1;x2--)
				{
					sumwei += date1[x2 - 1];
				}
				sumwei += f + 1;
			}
			else
			{
				for (x2 = e-1;x2 >= 1;x2--)
				{
					sumwei += date1[x2 - 1];
				}
				sumwei += f;
			}

		}
		sumwei = sumwei;


		if (a == d && b == e && c == f)
		{
			result = 0;
		}
		if (d == a)
		{
			if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
			{
				result = sumwei + sumshou - 366;
			}
			else
			{
				result = sumwei + sumshou - 365;
			}
		}
		if (d == a + 1)
		{
			result = sumwei + sumshou;
		}
		if (d > a + 1)
		{
			int x3;
			int sumzhong = 0;
			for (x3 = a + 1;x3 <= d - 1;x3++)
			{
				if ((x3 % 4 == 0 && x3 % 100 != 0) || (x3 % 400 == 0))
				{
					sumzhong += 366;
				}
				else
				{
					 sumzhong += 365;
				}
			}
			result = sumwei + sumshou + sumzhong;
		}
	 System.out.printf("%d",result);
		 return 0;
	}
}

