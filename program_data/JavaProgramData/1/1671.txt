package <missing>;

public class GlobalMembers
{
	//********************************
	//*???? 
	//********************************


	public static int f(int a, int b)
	{
		if (a == 1)
		{
			return 1;
		}
		else
		{
			int c;
			int d;
			int i;
			c = 0;
			d = (int)Math.sqrt((double)a);
			for (i = b; i <= a; i++)
			{
				if ((a % i) == 0)
				{
					c += f(a / i, i);
				}
			}
			return c;
		}
	}

	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2));
			System.out.print("\n");
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}

}

