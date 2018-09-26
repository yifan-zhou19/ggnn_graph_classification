package <missing>;

public class GlobalMembers
{
	public static int work(int n)
	{
		int i;
		int j;
		int k = n;
		if (n % 7 == 0)
		{
			return 0;
		}
		while (n >= 1)
		{
			if (n % 10 == 7)
			{
				return 0;
			}
			n /= 10;
		}
		return k * k;
	}
	public static int Main()
	{
	int[] a = new int[101];
	int i;
	int j;
	int sum = 0;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	sum += work(i);
	}
	System.out.print(sum);
		return 0;
	}

}

