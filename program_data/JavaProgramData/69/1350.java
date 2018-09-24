package <missing>;

public class GlobalMembers
{
	public static void cal(int[] a, int[] b, int l1, int l2)
	{
		for (int i = 0;i < l1;++i)
		{
			a[i] += b[i];
			if (a[i] >= 10)
			{
				++a[i + 1];
				a[i] -= 10;
			}
		}

		int j = l1;
		for (;a[j] == 0 && j >= 0;--j)
		{
			;
		}
		if (j == -1)
		{
			System.out.print("0");
		}
		else
		{
		for (int i = j;i >= 0;--i)
		{
			System.out.print(a[i]);
		}
		}
	}
	public static int Main()
	{
		int l1 = 0;
		int l2 = 0;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
		int[] d = new int[300];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;a.charAt(i) != 0;++i)
		{
			++l1;
		}
		for (int i = 0;i < l1;++i)
		{
		c[i] = a.charAt(l1 - 1 - i) - '0';
		}
		for (int i = 0;b.charAt(i) != 0;++i)
		{
			++l2;
		}
		for (int i = 0;i < l2;++i)
		{
		d[i] = b.charAt(l2 - 1 - i) - '0';
		}
		if (l1 >= l2)
		{
		cal(c, d, l1, l2);
		}
		else
		{
		cal(d, c, l2, l1);
		}

		return 0;
	}

}

