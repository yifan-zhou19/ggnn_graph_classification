package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[150]);
	public static int[] c1 = new int[150];
	public static int lc;
	public static char m;

	public static void que(int a, int b)
	{
		if (c1[a] != 0)
		{
			que(a + 1, b);
		}
		else
		{
			if (b == lc)
			{
				return;
			}
			if (c.charAt(b) == m)
			{
				que(a + 1, b + 1);
			}
			else
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
				c1[a] = 1;
				c1[b] = 1;
				while (c1[a] == 1)
				{
					a--;
				}
				que(a, b + 1);
			}
		}
	}


	public static int Main()
	{
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = c.charAt(0);
		lc = c.length();
		que(0, 1);
		return 0;
	}

}

