package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[16]);
		s = s.substring(0, 15);
		int i;
		int len;
		int p = 15;
		while (gets(s))
		{
			len = s.length() - 5;
		for (i = len;i >= 0;i--)
		{
			if (s.charAt(i) >= s.charAt(p))
			{
				p = i;
			}
		}
		for (i = 0;i <= p;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		for (i = len + 2;i <= len + 4;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		for (i = p + 1;i <= len;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		}
	}

}
