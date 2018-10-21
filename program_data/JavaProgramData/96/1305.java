package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[110]);
		int[] a = new int[110];
		int[] b = new int[110];
		int c;
		int num = 0;
		int flag = 0;
		aa = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 1; i <= aa.length();i++)
		{
			a[i - 1] = aa.charAt(i - 1) - '0';
		}
		if (aa.length() == 2)
		{
			if (10 * a[0] + a[1] < 13)
			{
				num = 1;
				b[1] = 0;
				a[1] = 10 * a[0] + a[1];
			}
		}
		if (aa.length() == 1)
		{
			num = 0;
			b[0] = 0;
		}
		if (aa.length() > 2 || (num == 0 && 10 * a[0] + a[1] >= 13))
		{
			for (int j = 1; j < aa.length();j++)
			{
			c = 10 * a[j - 1] + a[j];
			if (flag == 1)
			{
				c = c + a[j - 2] * 100;
				flag = 0;
			}
			if (c < 13)
			{
				b[j] = 0;
				flag = 1;
			}
			if (c >= 13)
			{
				if (num == 0)
				{
					num = j;
				}
				b[j] = c / 13;
				a[j] = c % 13;
			}
			}
		}
		for (int k = num;k < aa.length();k++)
		{
			System.out.print(b[k]);
		}
		System.out.print("\n");
		System.out.print(a[aa.length() - 1]);
		return 0;
	}
}

