package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		if (n == 2)
		{
		return 1;
		}
		if (n % 2 == 0)
		{
		return 0;
		}
		else
		{
		   for (i = 3;i < 1 + Math.sqrt(n);i = i + 2)
		   {
			if (n % i == 0)
			{
			break;
			}
		   }
		if (i > Math.sqrt(n))
		{
		return 1;
		}
		else
		{
		return 0;
		}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 5)
		{
		System.out.print("empty");
		System.out.print("\n");
		}
		else
		{
		for (int i = 3;i < n - 1;i = i + 2)
		{
			if (f(i) == 1 && 1 == f(i + 2))
			{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(i + 2);
			System.out.print("\n");
			}
		}
		}
		return 0;
	}


}

