package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = new int(int,int,int);
		int i;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;1;i++)
		{
			if (check(i, n, k) != 0)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
	}

	public static int check(int shally,int n,int k)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			shally = shally - k;
			if ((shally % n == 0) && (i == n))
			{
				return 1;
			}
			if (shally % n != 0)
			{
				return 0;
			}
			shally = shally - shally / n;
		}
	}
}

