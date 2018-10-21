package <missing>;

public class GlobalMembers
{
	public static int run(int a)
	{
		int b = 0;
		if (a % 4 != 0)
		{
		}
		else
		{
			if (a % 100 == 0)
			{
						if (a % 400 == 0)
						{
							b = 1;
						}
						else
						{
							b = 0;
						}
			}
			else
			{
				b = 1;
			}
		}
		return b;
	}
	public static int tian(int a,int b,int c)
	{
		int s = 0;
		int i = 0;
		for (i = 1;i <= a - 1;i++)
		{
						 s = s + 365 + run(i);
						 s = s % 7;
		}
		for (i = 1;i <= b - 1;i++)
		{
						   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						   {
							   s = s + 31;
						   }
						   else
						   {
						   if (i == 2)
						   {
								  if (run(a) == 1)
								  {
									  s = s + 29;
								  }
								  else
								  {
									  s = s + 28;
								  }
						   }
						   else
						   {
							   s = s + 30;
						   }
						   }
		}
		s = s + c - 1;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int l;
		int n;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = a % 400;
		if (a == 0)
		{
			a = 400;
		}
		l = tian(a, b, c);
		n = l % 7;
		if (n == 0)
		{
			System.out.print("Mon.");
		}
		if (n == 1)
		{
			System.out.print("Tue.");
		}
		if (n == 2)
		{
			System.out.print("Wed.");
		}
		if (n == 3)
		{
			System.out.print("Thu.");
		}
		if (n == 4)
		{
			System.out.print("Fri.");
		}
		if (n == 5)
		{
			System.out.print("Sat.");
		}
		if (n == 6)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

