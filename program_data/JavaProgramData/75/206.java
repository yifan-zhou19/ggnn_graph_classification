package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int j = 1;
		int k = 1;
		int l;
		int m;
		int n = 1;
		int max = 0;
		int[] a = new int[1003];
		int[] b = new int[1008];
		int[] c = new int[1008];
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() != '\n')
		{
			i++;
			n++;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() != '\n')
		{
			j++;
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		max = b[1];
		for (i = 1;i <= n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < max;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					c[i]++;
				}
			}
		}
		m = max;
		max = c[0];

		for (i = 0;i < m;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
	}

}

