package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void input()
	{
		int i;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a[0] = n;
		b[0] = m;
	} //???????????????????0???
	public static void sort(int[] a)
	{
		int i;
		int j;
		for (i = 1;i < a[0];i++)
		{
			for (j = 1;j <= a[0] - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	} //????
	public static void output()
	{
		int i;
		for (i = 1;i <= a[0];i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (i = 1;i <= b[0] - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[b[0]]);
	} //??
	public static int Main()
	{
		input();
		sort(a);
		sort(b);
		output();
		return 0;
	}
}

