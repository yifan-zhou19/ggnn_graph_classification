package <missing>;

public class GlobalMembers
{
	public static int ava(int a,int n,int k)
	{
		int num = a;
		for (int i = 1;i <= n - 1;i++)
		{
			if ((num * n + k) % (n - 1) != 0)
			{
				return 0;
			}
			else
			{
				num = (num * n + k) / (n - 1);
			}
		}
		return (num * n + k);

	}
	public static int Main()
	{
	int n;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int num;
	for (int p = 1;;p++)
	{
		num = ava(p, n, k);
		if (num != 0)
		{
			break;
		}
	}
	System.out.print(num);

	}
}

