package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int m;
		int n;
		int l;
		i = 1;
		j = 1;
		l = 1;
		a[i] = x;
		b[j] = y;
		while (a[i] != 1)
		{
			a[i + 1] = a[i] / 2;
			i = i + 1;
		}
		m = i;
		while (b[j] != 1)
		{
			b[j + 1] = b[j] / 2;
				j = j + 1;
		}
		n = j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i] == b[j])
				{
					m = i;
					n = j;
					l = 0;
					break;
				}
			}
			if (l == 0)
			{
				break;
			}
		}
		System.out.print(a[m]);
		return 0;
	}


}

