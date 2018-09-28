package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] p = a;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n - m;j++) //??n-m??????
		{
				p[n] = p;
				p++;
		}
		for (int k = n - m;k < 2 * n - m;k++) //??n-m??????
		{
				if (k == 2 * n - m - 1)
				{
					System.out.print(a[k]);
				}
				else
				{
					System.out.print(a[k]);
					System.out.print(' ');
				}
		}
		return 0;
	}

}

