package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] s = new int[251];
		int c = 0;
		int p = 0;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--)
		{
			s[c] += a.charAt(i) - '0' + b.charAt(j) - '0';
			if (s[c] > 9)
			{
				s[c] -= 10;
				s[c + 1]++;
			}
			c++;
		}
		if (i == -1)
		{
			for (; j >= 0; j--)
			{
				s[c] += b.charAt(j) - '0';
				if (s[c] > 9)
				{
					s[c] -= 10;
					s[c + 1]++;
				}
				c++;
			}

		}
		else
		{
			for (; i >= 0; i--)
			{
				s[c] += a.charAt(i) - '0';
				if (s[c] > 9)
				{
					s[c] -= 10;
					s[c + 1]++;
				}
				c++;
			}

		}
		for (i = 250; i >= 0; i--)
		{
			if (s[i] == 0 && p == 0)
			{
				continue;
			}
			else
			{
				p = 1;
				System.out.print(s[i]);
			}
		}
		if (p == 0)
		{
			System.out.print("0");
		}
		return 0;
	}
}

