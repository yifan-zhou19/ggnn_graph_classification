package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[10000];
	public static int[] d = new int[10000];

	public static void jian(int[] a, int[] b)
	{
		int i;
		int j;
		int k;
		int m;
		for (i = 0;i <= 9000;i++)
		{
			c[i] = 0;
		}
		m = a[0] + b[0] - 1;
		for (i = 1;i <= a[0] + b[0] - 1;i++)
		{
			c[i] = c[i] + a[i] - b[i];
			if (c[i] < 0)
			{
				c[i + 1] = -1;
				c[i] += 10;
			}
		}
		j = m + 10;
		while (j > 1 && c[j] == 0)
		{
			j--;
		}
		for (i = 1;i <= a[0] + 1;i++)
		{
		a[i] = c[i];
		}
		a[0] = j;
		for (i = j;i >= 1;i--)
		{
		System.out.print(a[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int len1 = 0;
		int len2 = 0;
		String s1 = new String(new char[10000]);
		String s2 = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
		for (i = 0;i <= 9000;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = s1.length();
		len2 = s2.length();
		a[0] = len1;
		b[0] = len2;
		for (i = 1;i <= len1;i++)
		{
		a[len1 - i + 1] = ((int)s1.charAt(i - 1)) - 48;
		}
		for (i = 1;i <= len2;i++)
		{
		b[len2 - i + 1] = ((int)s2.charAt(i - 1)) - 48;
		}
		jian(a, b);
		}
		return 0;
	}

}

