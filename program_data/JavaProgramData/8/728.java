package <missing>;

public class GlobalMembers
{
	public static void change(int[] a, int[] b, int[] c)
	{
		int x = 0;
		int y = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j = 0;
		int t = 0;
		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < y - 1;i++)
		{
			for (j = 0;j < y - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			c[i] = a[i];
		}
		for (i = x;i < x + y;i++)
		{
			c[i] = b[i - x];
		}
		for (i = 0;i < x + y - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(' ');
		}
		System.out.print(c[x + y - 1]);
	} //?????????????
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[2000];
		change(a, b, c); //????
		return 0;
	}
}

