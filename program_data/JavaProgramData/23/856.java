package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		final String a = "";
		int i;
		int len;
		int l = 0;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
			a.charAt(l)[p] = s.charAt(i);
		p++;
			}
		if ((s.charAt(i + 1) == ' ' && s.charAt(i) != ' ') || s.charAt(i + 1) == '\0')
		{
			l++;
			p = 0;
		}
		}
		System.out.printf("%s",a.charAt(l - 1));
		for (i = l - 2;i >= 0;i--)
		{
			System.out.printf(" %s",a.charAt(i));
		}
		return 0;
	}


}
