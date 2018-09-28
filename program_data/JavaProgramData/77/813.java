package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[100];
	public static int fe(int n)
	{
		int i;
		int t = 0;
		for (i = 0;;i++)
		{
			if (b[i] == 0)
			{
				t++;
			}
			if (t == n)
			{
				break;
			}
		}
		return i;
	}
	public static int m(int n)
	{
		int i;
		for (i = fe(n) - 1;i >= 0;i--)
		{
			if (b[i] == 1)
			{
				break;
			}
		}
		return i;
	}
	public static void hands(int n)
	{
		if (n > 1)
		{
			hands(n - 1);
			System.out.print(m(n));
			System.out.print(" ");
			System.out.print(fe(n));
			System.out.print("\n");
			b[m(n)] = -1;
		}
		else
		{
			System.out.print(m(1));
			System.out.print(" ");
			System.out.print(fe(1));
			System.out.print("\n");
			b[m(1)] = -1;
		}
	}


	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
				b[i] = 1;
			}
			else
			{
				b[i] = 0;
			}
		}
		hands(i / 2);
		return 0;
	}
}

