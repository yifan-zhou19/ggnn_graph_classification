package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Y;
		int M;
		int D;
		int m;
		int m1 = 0;
		int n1;
		int n2;
		int n3;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			D = Integer.parseInt(tempVar3);
		}
		if ((Y - 1) % 400 == 0)
		{
			n1 = 0;
		}
		else
		{
			n1 = 0;
			for (i = (Y - 1) / 400 * 400;i <= Y - 1;i++)
			{
				if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0)
				{
					n1 = n1 + 2;
				}
				else
				{
					n1 = n1 + 1;
				}
			}
		}
		for (m = 1;m < M;m++)
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
			{
				m1 = m1 + 31;
			}
			else if (m == 4 || m == 6 || m == 9 || m == 11)
			{
				m1 = m1 + 30;
			}
			else if (m == 2)
			{
				if (Y % 400 == 0 || Y % 4 == 0 && Y % 100 != 0)
				{
					m1 = m1 + 29;
				}
				else
				{
					m1 = m1 + 28;
				}
			}
		}
		n2 = m1 % 7;
		n3 = D % 7;
		n = n1 + n2 + n3 - 2;
		if (n % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (n % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (n % 7 == 3)
		{
			 System.out.print("Wed.");
		}
		else if (n % 7 == 4)
		{
			 System.out.print("Thu.");
		}
		else if (n % 7 == 5)
		{
			 System.out.print("Fri.");
		}
		else if (n % 7 == 6)
		{
			 System.out.print("Sat.");
		}
		else
		{
			 System.out.print("Sun.");
		}
		scanf(" ");
		return 0;
	}
}

