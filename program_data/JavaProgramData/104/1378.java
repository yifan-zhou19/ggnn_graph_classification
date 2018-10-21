package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void cha_pri(int,int);
		if (a != b)
		{
			cha_pri(a, b);
		}
		else
		{
			System.out.print(a);
			System.out.print("\n");
		}

		return 0;
	}

	public static void cha_pri(int m,int n)
	{
		void cha_pri(int,int);
		if (m > n)
		{
			m /= 2;
			if (m == n)
			{
				System.out.print(m);
			}
			else
			{
				cha_pri(m, n);
			}
		}
		else if (m < n)
		{
			n /= 2;
			if (m == n)
			{
				System.out.print(m);
			}
			else
			{
				cha_pri(m, n);
			}
		}
		else
		{
			return;
		}
	}
}

