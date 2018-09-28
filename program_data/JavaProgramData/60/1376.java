package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int k = 0;
		for (i = 1;i <= x;i++)
		{
			if (x % i == 0)
			{
				k = k + 1;
			}
		}
		if (k == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n - 2;i++)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i + 2);
				System.out.print("\n");
			}
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
	}

}

