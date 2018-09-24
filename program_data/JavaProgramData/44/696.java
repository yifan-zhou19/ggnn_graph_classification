package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int b = 0;
		int t;
		for (i = 1;a != 0;i++)
		{
						 t = a % 10;
						 b = b * 10 + t;
						 a = a / 10;
		}
		return b;
	}
	public static int Main()
	{
		int x;
		int j;
		int[] c = new int[6];
		for (j = 1;j <= 6;j++)
		{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[j] = f(x);
		}

		for (j = 1;j <= 6;j++)
		{
						 System.out.print(c[j]);
						 System.out.print("\n");
		}

		return 0;
	}
}

