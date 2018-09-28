package <missing>;

public class GlobalMembers
{
	public static int t = 1;
	public static int Main()
	{
		int num = new int(int,int,int);
		int n;
		int k;
		int num_mon;
		int tot;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num_mon = n;
		tot = num(n, k, num_mon);
		System.out.print(tot);
		System.out.print("\n");

		return 0;
	}

	public static int num(int n,int k,int num_mon)
	{
		int tot;
		if (num_mon == 0)
		{
				return t;
		}
		else
		{
			while (true)
			{
				tot = n * num(n, k, num_mon - 1) / (n - 1) + k;
				if (num(n, k, num_mon - 1) % (n - 1) == 0)
				{
						return tot;
				break;
				}
				else
				{
					t++;
				}
			}
		}
	}


}

