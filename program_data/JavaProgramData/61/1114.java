package <missing>;

public class GlobalMembers
{
	public static int f(int[] str, int i)
	{
		if (i == 0)
		{
			return str[0];
		}
		else if (i == 1)
		{
			return str[1];
		}
		else
		{
			str[i] = f(str, i - 1) + f(str, i - 2);
			return str[i];
		}
	}
	public static int Main()
	{
		int[] str = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(str, a - 1));
			System.out.print("\n");
		}

		return 0;
	}
}

