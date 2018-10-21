package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[2500];
		int b = 0;
		int c = 0;
		int x;
		int d;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i < m;i++)
		{
			c = 0;
			for (j = 2;j * j <= i;j++)
			{
				d = i % j;
				if (d == 0)
				{
					c = 1;
					break;
				}
			}
			if (c == 0)
			{
				a[b] = i;
				b++;
			}
		}
		x = b;
		for (i = 0;i < x;i++)
		{
			for (j = x - 1;j > i - 1;j--)
			{
				if (m == a[i] + a[j])
				{
					x = j;
					System.out.print(a[i]);
					System.out.print(" ");
					System.out.print(a[j]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

