package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int i;
		int t;
		int j;
		int s;
		int len;
		int len1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len = b.length();
		for (i = 0; i <= len1 - len; i++)
		{
			t = 1;
			for (j = 0; j < len; j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					t = 0;
				}
			}
			if (t == 1)
			{
				s = i;
				break;
			}
		}
		if (t == 1)
		{
			for (i = 0; i < s; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(c);
			for (i = s + len; i < len1; i++)
			{
				System.out.print(a.charAt(i));
			}
		}
		else
		{
			System.out.print(a);
		}
		System.out.print("\n");

		return 0;
	}


}

