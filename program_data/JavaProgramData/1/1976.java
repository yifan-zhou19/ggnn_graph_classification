package <missing>;

public class GlobalMembers
{
	public static int f(int a, int min)
	{
		if (a < min)
		{
			return 0;
		}
		int result = 1;
		for (int i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				result += f(a / i, i);
			}
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.printf("%d\n",f(a, 2));
		}
		return 0;
	}
}

