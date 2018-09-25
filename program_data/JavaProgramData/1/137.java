package <missing>;

public class GlobalMembers
{
	public static int factor(int a,int min)
	{
		int count = 0;
		for (int i = min;i <= a;i++)
		{
			if (i == a)
			{
				count += 1;
			}
			if (a % i == 0)
			{
				count += factor(a / i, i);
			}
		}
		return count;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int result = factor(a, 2);
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}

}

