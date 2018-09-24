package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????? **
	//*?????? 1300062706 **
	//*???2013.12.5**
	//********************************
	public static int n;
	public static int k;
	public static int monkey(int m, int i)
	{
		if (i == n + 1)
		{
			return m;
		}
		else
		{
			if (m % (n - 1) == 0)
			{
				return monkey(m * n / (n - 1) + k, i + 1);
			}
			else
			{
				return 0;
			}
		}
	}
	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1;;i += n - 1)
		{
			if (monkey(i, 1) % n != 0)
			{
				System.out.print(monkey(i, 1));
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

