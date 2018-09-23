package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a,int b);
		int n;
		int a;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2));
			System.out.print("\n");
		n--;
		}
	return 0;
	}

	public static int f(int a,int b)
	{
		int i;
		int s = 1;

		if (a < b)
		{
			return 0;
		}
		for (i = b;i < a;i++)
		{
			if (a % i == 0)
			{
				s = s + f(a / i, i);
			}
		}
			return s;
	}
}

