package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n >= 1)
		{
		int[] c = new int[200];
		int[] d = new int[200];
		int[] e = new int[200];
		int le1;
		int le2;
		int i;
		int j;
		int m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		le1 = a.length();
		le2 = b.length();

		for (i = 0,j = le1 - 1;i <= le1 - 1,j >= 0;i++,j--)
		{
			c[i] = a.charAt(j) - '0';
		}
		for (i = 0,j = le2 - 1;i <= le2 - 1,j >= 0;i++,j--)
		{
			d[i] = b.charAt(j) - '0';
		}

		for (i = 0;i <= 199;i++)
		{
			if (c[i] >= d[i])
			{
				e[i] = c[i] - d[i];
			}
			if (c[i] < d[i])
			{
				e[i] = 10 + c[i] - d[i];
				c[i + 1] = c[i + 1] - 1;
			}

		}

		for (i = 199;i >= 0;i--)
		{
			if (e[i] != 0)
			{
				m = i;
				break;
			}
		}
		for (i = m;i >= 0;i--)
		{
			System.out.print(e[i]);
		}
		System.out.print("\n");
		n--;
		}
		return 0;
	}
}

