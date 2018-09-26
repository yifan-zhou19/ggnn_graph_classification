package <missing>;

public class GlobalMembers
{
	public static int t = 1;
	public static int f(int n,int k,int m)
	{
		int num;
		if (m == 0)
		{
			return t;
		}
		else
		{
			while (true)
			{
				num = (n * f(n, k, m - 1)) / (n - 1) + k;
				if (f(n, k, m - 1) % (n - 1) == 0)
				{
					return num;
					break;
				}
				else
				{
					t++;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int monkey;
		monkey = n;
		System.out.print(f(n, k, monkey));
		System.out.print("\n");
		return 0;
	}
}

