package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int sign = 0;
	public static int work(int n)
	{
		int s = 12;
		int i;
		for (i = 1;i < n;i++)
		{
		s += a[i];
		}
		if ((s + sign) % 7 == 5)
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
		int m;
		int i;
		sign = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
		if (work(i) != 0)
		{
		System.out.print(i);
		System.out.print("\n");
		}
		}
		return 0;
	}

}

