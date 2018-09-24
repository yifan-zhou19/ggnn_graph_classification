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
		int p = 0;
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
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				p += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				p += 30;
			}
			else if (i == 2)
			{
				if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
				{
					p += 29;
				}
				else
				{
					p += 28;
				}
			}
		}
		if (a > 2000)
		{
			a %= 2000;
		}
		for (j = 1;j < a;j++)
		{
			if (j % 400 == 0 || (j % 4 == 0 && j % 100 != 0))
			{
				p += 2;
			}
			else
			{
				p += 1;
			}
		}
		p += c;
		if (p % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (p % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (p % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (p % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (p % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else if (p % 7 == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}



}

