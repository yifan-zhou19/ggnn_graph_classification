package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int i;

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
	a = a % 1600;
	for (i = 1;i < a;i++)
	{
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
			{
				d += 2;
			}
			else
			{
				d += 1;
			}
					   d = d % 7;


	}
									 for (i = 1;i < b;i++)
									 {
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10))
			{
				d += 3;
			}
			else
			{
				if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
				{
				d += 2;
				}
				else
				{
					if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
					{
						d += 1;
					}
				}
					  d = d % 7;


			}
									 }
		d += c;
			 d = d % 7;
		if (d == 1)
		{
			System.out.print("Mon.");
		}
		if (d == 2)
		{
			System.out.print("Tue.");
		}
		if (d == 3)
		{
			System.out.print("Wed.");
		}
		if (d == 4)
		{
			System.out.print("Thu.");
		}
		if (d == 5)
		{
			System.out.print("Fri.");
		}
		if (d == 6)
		{
			System.out.print("Sat.");
		}
		if (d == 0)
		{
			System.out.print("Sun.");
		}
	return 0;
	}

}

