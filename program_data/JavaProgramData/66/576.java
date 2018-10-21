package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int m = 0;
		int n = 0;
		int p = 0;
		int q = 0;
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
			m++;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
			n++;
			}
			else if (i == 2)
			{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
			p++;
			}
			else
			{
			q++;
			}
			}
		}
		d = (a - 1) % 7 * 365 + m * 31 + n * 30 + p * 29 + q * 28 + c + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		e = d % 7;
		if (e == 0)
		{
			System.out.print("Sun.");
		}
		else if (e == 1)
		{
			System.out.print("Mon.");
		}
		else if (e == 2)
		{
			System.out.print("Tue.");
		}
		else if (e == 3)
		{
			System.out.print("Wed.");
		}
		else if (e == 4)
		{
			System.out.print("Thu.");
		}
		else if (e == 5)
		{
			System.out.print("Fri.");
		}
		else if (e == 6)
		{
			System.out.print("Sat.");
		}
	   return 0;
	}

}

