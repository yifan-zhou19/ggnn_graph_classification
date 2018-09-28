package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[10000];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n / 2;i++)
		{
			j = (p + i);
			p[i] = (p + n - 1 - i);
			p[n - 1 - i] = j;
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			if (i == n - 1)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

