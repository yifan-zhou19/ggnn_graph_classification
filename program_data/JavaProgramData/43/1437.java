package <missing>;

public class GlobalMembers
{
	public static int checkprime(int x)
	{
		int j;
		int count = 0;
		for (j = 2;j <= Math.sqrt(x);j++)
		{
			if (x % j == 0)
			{
				count++;
			}

		}
		return count;

	}
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= n / 2;i++)
		{
			if (checkprime(i) == 0 && checkprime(n - i) == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n - i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

