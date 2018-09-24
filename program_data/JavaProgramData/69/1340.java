package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = a.length();
		int len2 = b.length();
		if (len1 == 1 && len2 == 1 && a.charAt(0) == '0' && b.charAt(0) == '0')
		{
			System.out.print(0);
			System.out.print("\n");
			return 0;
		}
		if (len1 > len2)
		{
			String temp = new String(new char[251]);
			temp = a;
			a = b;
			b = temp;
		}

		len1 = a.length();
		len2 = b.length();
			int over = 0;
			int i;
			for (i = len1 - 1;i >= 0;i--)
			{
				int t = len2 - len1 + i;
				b.charAt(t) += a.charAt(i) - '0';
				if (b.charAt(t) > '9')
				{
					b.charAt(t) -= 10;
					if (t > 0)
					{
						b.charAt(t - 1) += 1;
					}
					else
					{
						over = 1;
					}
				}
			}
			for (i = len2 - 1;i > 0;i--)
			{
				if (b.charAt(i) > '9')
				{
					b.charAt(i) -= 10;
					b.charAt(i - 1) += 1;
				}
			}
			if (b.charAt(0) > '9')
			{
				b.charAt(0) -= 10;
				over = 1;
			}
			if (over > 0)
			{
				System.out.print(over);
			}
			else
			{
				for (i = 0;i < len2;i++)
				{
					if (b.charAt(i) != '0')
					{
						break;
					}
				}
			}
			System.out.print(b.Substring(i));
			System.out.print("\n");
	}
}

