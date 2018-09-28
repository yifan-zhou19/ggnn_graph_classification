package <missing>;

public class GlobalMembers
{
	public static void checkstr(String str, int i)
	{
		int b;
		int e;
		int b1;
		int b2;
		int e2;
		int count = 0;
		int len;
		len = str.length();
		for (b = 0 ; b <= len - i ; b++)
		{
			b2 = b;
			e2 = b + i - 1;
			for (b1 = b, e = b + i - 1; b1 < e ; b1++, e--)
			{
				if (str[b1].equals(str[e]))
				{
					count++;
				}
			}
			if (count == i / 2)
			{
				for (b1 = b2 ; b1 <= e2 - 1; b1++)
				{
					System.out.print(str[b1]);
				}
				System.out.print(str[e2]);
				System.out.print("\n");
			}
			count = 0;
		}
	}

	public static int Main()
	{
		String str = new String(new char[500]);
		int i = 2;
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 2 ; i <= len ; i++)
		{
			checkstr(str, i);
		}
		return 0;
	}




}

