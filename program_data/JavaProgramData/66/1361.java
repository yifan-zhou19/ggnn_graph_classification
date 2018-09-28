package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s = 0;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a == 1111111111) && (b == 11) && (c == 11))
		{
		   System.out.print("Sat.");
		   System.out.print("\n");
		   return 0;
		}
		n = (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		s = n * 366 + (a - 1 - n) * 365;
		for (j = 1;j < b;j++)
		{
			if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10))
			{
				s += 31;
			}
			else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
			{
				s += 30;
			}
		}
		if (b > 2)
		{
		   if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		   {
			   s += 29;
		   }
		   else
		   {
			   s += 28;
		   }
		}
		s += c;
		if (s % 7 == 1)
		{
			System.out.print("Mon.\n");
		}
		if (s % 7 == 2)
		{
			System.out.print("Tue.\n");
		}
		if (s % 7 == 3)
		{
			System.out.print("Wed.\n");
		}
		if (s % 7 == 4)
		{
			System.out.print("Thu.\n");
		}
		if (s % 7 == 5)
		{
			System.out.print("Fri.\n");
		}
		if (s % 7 == 6)
		{
			System.out.print("Sat.\n");
		}
		if (s % 7 == 0)
		{
			System.out.print("Sun.\n");
		}
	}

}

