package <missing>;

public class GlobalMembers
{
	public static int max(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int[] a = new int[260];
		int[] b = new int[260];
		int carry = 0;
		int[] c = new int[260];
		int i;
		int j;
		String s1 = new String(new char[260]);
		String s2 = new String(new char[260]);
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = s1.length();
		int len2 = s2.length();
		int len = max(len1, len2);
		for (i = len1 - 1, j = 0; i >= 0; --i, ++j)
		{
			a[i] = s1.charAt(j) - '0';
		}
		for (i = len2 - 1, j = 0; i >= 0; --i, ++j)
		{
			b[i] = s2.charAt(j) - '0';
		}
		for (i = 0; i < len + 1; ++i)
		{
			c[i] = a[i] + b[i] + carry;
			if (c[i] >= 10)
			{
				carry = 1;
				c[i] -= 10;
			}
			else
			{
				carry = 0;
			}
		}
		int judge = 0;
		/*for(i = len; c[i] == 0; --i);
		cout << i << endl;
		if(1) cout << 0;
		else*/
		for (;i >= 0; --i)
		{
			if (c[i] != 0 || (c[i] == 0 && i == 0))
			{
				judge = 1;
			}
			if (judge == 1)
			{
				System.out.print(c[i]);
			}
		}
		return 0;
	}

}

