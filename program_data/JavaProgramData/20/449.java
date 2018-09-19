package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String s = new String(new char[10]);
		String subs = new String(new char[4]);
		while (scanf("%s %s",s,subs) != EOF)
		{
		int n;
		int i;
		n = s.length();
		p = s.charAt(0);
		for (i = 1;i < n;i++)
		{
			if (s.charAt(i) > p)
			{
				p = s.charAt(i);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",s.charAt(i));
			if (s.charAt(i) == p)
			{
				System.out.printf("%s",subs);
			}
		}
		System.out.print("\n");
		}
	}

}
