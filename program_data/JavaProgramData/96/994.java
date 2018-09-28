package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[101];
		int[] c = new int[101];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		int i;
		int x;
		int j;
		int k;
		for (i = 0;i < l;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		x = b[0];
		for (i = 0;i < l - 1;i++)
		{
			c[i] = x / 13;
			x = (x - 13 * c[i]) * 10 + b[i + 1];
		}
		c[i] = x / 13;
		x = x - 13 * c[i];
		for (k = 0; ;k++)
		{
			if (c[k] != 0)
			{
				break;
			}
		}
		if (l == 1)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else if (l == 2 && b[0] == 1 && b[1] <= 2)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
				for (j = k;j <= i;j++)
				{
				System.out.print(c[j]);
				}
			System.out.print("\n");
		}
		System.out.print(x);
		return 0;
	}

}

