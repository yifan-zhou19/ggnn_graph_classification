package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int order(int[] str, int po, int start)
	{
		for (int i = 1;i < po;i++)
		{
			for (int j = 1;j <= po - i;j++)
			{
				if (str[j] > str[j + 1])
				{
					swap(str[j],str[j + 1]);
				}
			}
		}
		for (int i = start;i < po + start;i++)
		{
				c[i] = str[i - start + 1];
		}
		return 0;
	}
	public static int output()
	{
		order(a, m, 1);
		order(b, n, m + 1);
		for (int i = 1;i < m + n;i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c[m + n]);
		return 0;
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1;j <= n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		output();
		return 0;
	}
}

