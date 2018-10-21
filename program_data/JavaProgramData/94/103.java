package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[501];
		int[] b = new int[501];
		int n;
		int m;
		int i;
		int j;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0) //???????b
			{
				b[m + 1] = a[i];
				m++;
			}
		}
		for (i = 1;i <= m - 1;i++)
		{
			for (j = 1;j <= m - i;j++) //????
			{
				if (b[j] > b[j + 1])
				{
					b[0] = b[j];
					b[j] = b[j + 1];
					b[j + 1] = b[0];
				}
			}
		}
		e = 0;
		for (i = 1;i <= m;i++) //??
		{
			if (e == 1)
			{
				System.out.print(',');
			}
			System.out.print(b[i]);
			e = 1;
		}
		return 0;
	}
}

