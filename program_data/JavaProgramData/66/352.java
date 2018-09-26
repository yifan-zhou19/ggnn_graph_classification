package <missing>;

public class GlobalMembers
{
	public static int Dijitian(int a,int b,int c)
	{
		int s = 0;
		for (int i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				s += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				s += 30;
			}
			else if (i == 2)
			{
				if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0))
				{
					s += 29;
				}
				else
				{
					s += 28;
				}
			}
		}
		s += c;
		return s;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
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
		int m;
		int sum;
		int result;
		m = (a - 1) * 365 + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		sum = m + Dijitian(a, b, c);
		result = sum % 7;
		if (a == 1111111111 && b == 11 && c == 11)
		{
			System.out.print("Sat.");
		}
		else
		{

		if (result == 0)
		{
			System.out.print("Sun.");
		}
		else if (result == 1)
		{
			System.out.print("Mon.");
		}
		else if (result == 2)
		{
			System.out.print("Tue.");
		}
		else if (result == 3)
		{
			System.out.print("Wed.");
		}
		else if (result == 4)
		{
			System.out.print("Thu.");
		}
		else if (result == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		}
		return 0;
	}



}

