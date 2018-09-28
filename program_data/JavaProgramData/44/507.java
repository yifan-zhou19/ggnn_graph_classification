package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int i;
		int j = 0;
		int[] b = new int[20];
		int c = 0;
		int t = 0;
		if (a > 0)
		{
			;
		}
		else
		{
				a = -a;
				t = 1;
		}
		for (i = 0;a > 0;i++)
		{
			b[i] = a % 10;
			a = a / 10;
		}
		for (j = 0;j < i;j++)
		{
			c = 10 * c + b[j];
		}
		if (t == 1)
		{
			c = -c;
		}
		return c;
	}
	public static int Main()
	{
		int i = 0;
		int a = 0;
		for (i = 0;i < 6;i++)
		{
			while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				System.out.print(reverse(a));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

