package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int i;
	public static int m;
	public static int N = INT_MAX;
	public static int total(int number, int sur)
	{
		if (number == n)
		{
			return i;
		}
		if (total(number + 1, sur) != 0 && total(number + 1, sur) % (n - 1) == 0)
		{
			return n * total(number + 1, sur) / (n - 1) + k;
		}
		return 0;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n + k; i < N; i += n)
		{
			m = total(1, i);
			if (m != 0)
			{
				break;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

