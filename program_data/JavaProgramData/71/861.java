package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a % 4 == 0)
		{
			if (a % 100 == 0)
			{
				if (a % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 1;
			}
		}
		else
		{
			return 0;
		}
	}
	public static int f1(int x,int y)
	{
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
		{
			return 31;
		}
		else if (x == 4 || x == 6 || x == 9 || x == 11)
		{
			return 30;
		}
		else if (x == 2 && y == 1)
		{
			return 29;
		}
		else
		{
			return 28;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int c;
		while (n-- != 0)
		{
			s = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b < c)
			{
				j = f(a);
				for (i = b;i < c;i++)
				{
					s = s + f1(i, j);
				}
			}
			else
			{
				j = f(a);
				for (i = c;i < b;i++)
				{
					s = s + f1(i, j);
				}
				/*for(i=1;i<=c;i++)
				{
					j=f(a+1);
					s=s+f1(i,j);
				}*/
			}
			if (s % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

