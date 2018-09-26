package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int m;
	public static int n;
	public static void input()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void resort()
	{
		sort(a + 1,a + m + 1);
		sort(b + 1,b + n + 1);
	}
	public static void output()
	{
		System.out.print(a[1]);
		for (int i = 2;i <= m;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		for (int i = 1;i <= n;i++)
		{
			System.out.print(' ');
			System.out.print(b[i]);
		}
	}
	public static int Main()
	{
		input();
		resort();
		output();
	}
}

