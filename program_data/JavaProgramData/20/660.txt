package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[13]);
		String p;
		String h;
		int l;
		int i;
		int m;
		while (gets(str))
		{
			p = str;
			h = str;
			m = 0;
			l = p.length();
			for (i = 0;i < (l - 4);i++)
			{
				if (h < *(p.Substring(i)))
				{
					h = p.Substring(i);
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
			System.out.printf("%c%c%c",*(p.Substring(l) - 3),*(p.Substring(l) - 2),*(p.Substring(l) - 1));
			for (i = m + 1; * (p.Substring(i)) != ' ';i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
			System.out.print("\n");
		}
	return 0;
	}
}
