package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1001];
	public static void count(int n)
	{
		if (n == 0)
		{
			return;
		}
		for (int i = 1000;i > 0;i--)
		{
			a[i] = a[i] * 2;
		}
		for (int i = 1000;i > 0;i--)
		{
			if (a[i] >= 10)
			{
				a[i] -= 10;
				a[i - 1]++;
			}
		}
		count(n - 1);
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1000] = 1;
		count(n);
		for (int i = 0;i < 1001;i++)
		{
			if (a[i] != 0)
			{
				for (int j = i;j < 1001;j++)
				{
					System.out.print(a[j]);
				}
				break;
			}
		}
		return 0;
	}
}

