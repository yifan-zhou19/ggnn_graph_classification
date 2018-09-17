package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		int y;
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		i = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x >= 1)
		{
			a[i] = x;
			if (x % 2 == 0)
			{
				x = x / 2;
			}
			else
			{
				x = (x - 1) / 2;
			}
			i = i + 1;
		}
		j = 0;
		while (y >= 1)
		{
			b[j] = y;
			if (y % 2 == 0)
			{
				y = y / 2;
			}
			else
			{
				y = (y - 1) / 2;
			}
			j = j + 1;
		}
		while (j > 0 && i > 0)
		{
			if (b[j - 1] != a[i - 1])
			{
				System.out.print(a[i]);
				System.out.print("\n");
				break;
			}
			else if (i == 1)
			{
				System.out.print(a[0]);
				System.out.print("\n");
			}
			else if (j == 1)
			{
				System.out.print(b[0]);
				System.out.print("\n");
			}
			j = j - 1;
			i = i - 1;
		}
		return 0;
	}
}

