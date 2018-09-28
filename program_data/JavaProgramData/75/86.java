package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][1000];
		int i = 0;
		int j;
		int c = 1000;
		int b = 0;
		int[] m = new int[1000];
		while (true)
		{
			a[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
			i++;
		}
		i = 0;
		while (true)
		{
			a[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
			i++;
		}
		for (j = 0;j <= i;j++)
		{
			if (a[0][j] < c)
			{
				c = a[0][j];
			}
			if (a[1][j] > b)
			{
				b = a[1][j];
			}
		}
		for (;c < b;c++)
		{
			for (j = 0;j <= i;j++)
			{
			if (a[0][j] <= c != 0 && a[1][j]> c)
			{
				m[c]++;
			}
			}
		}
			for (j = 0;j < b;j++)
			{
				if (m[0] < m[j])
				{
					m[0] = m[j];
				}
			}
			System.out.print(i + 1);
			System.out.print(' ');
			System.out.print(m[0]);
			return 0;
	}
}

