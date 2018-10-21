package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[400];
		int n;
		int m;
		int i;
		int j;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 400; i++)
		{
			a[i] = 1;
		}
		count = 0;
		i = 0;
		j = 0;
		while (n != 0)
		{
			while (count < (n - 1))
			{
				i++;
				if (i == (n + 1))
				{
					i = 1;
				}
				if (a[i] != 0)
				{
					j++;
					if (j == m)
					{
						a[i] = 0;
						j = 0;
						count++;
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] != 0)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
			}
			for (i = 0; i < 400; i++)
			{
				a[i] = 1;
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count = 0;
			i = 0;
			j = 0;
		}
		return 0;
	}
}

