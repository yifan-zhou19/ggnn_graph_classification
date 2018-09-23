package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[15]);
		char p = '\0';
		int i;
		int len;
		int max;
		while (gets(s))
		{
		len = s.length() - 4;
		for (i = 0;i < len;i++)
		{
			if (*(s.Substring(i)) > p)
			{
			p = (s.Substring(i));
			max = i;
			}
		}
		for (i = 0;i <= max;i++)
		{
			System.out.printf("%c",*(s.Substring(i)));
		}
		for (i = len + 1;i <= len + 3;i++)
		{
			System.out.printf("%c",*(s.Substring(i)));
		}
		for (i = max + 1;i < len;i++)
		{
			System.out.printf("%c",*(s.Substring(i)));
		}
		p = '\0';
		System.out.print("\n");
		}
	}


}
