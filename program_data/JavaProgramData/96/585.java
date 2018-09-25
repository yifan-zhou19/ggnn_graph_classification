package <missing>;

public class GlobalMembers
{
	public static final String temp = "\0";
	public static int Main()
	{
		int len;
		int i;
		int[] a = new int[105];
		int num;
		final String c = "\0";
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = c.length();
		for (i = 0;i < 105;i++)
		{
			a[i] = c.charAt(i) - '0';
		}
		if (len < 2)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(a[0]);
			System.out.print("\n");
			return 0;
		}
		else
		{
			num = a[0] * 10 + a[1];
			if (num > 13)
			{
				System.out.print(num / 13);
			}
			else if (len == 2)
			{
				System.out.print('0');
				System.out.print("\n");
			}
			a[1] = num % 13;
			for (i = 1;i < len - 1;++i)
			{
				num = a[i] * 10 + a[i + 1];
				a[i + 1] = num % 13;
				System.out.print(num / 13);
			}
			System.out.print("\n");
			System.out.print(a[i]);
			System.out.print("\n");
		}
	return 0;
	}
}

