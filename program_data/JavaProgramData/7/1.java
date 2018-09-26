package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int len2;
		int i;
		int j;
		int f;
		int ff;
		String s = new String(new char[300]);
		String sub = new String(new char[300]);
		String replace = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		sub = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();
		len2 = sub.length();
		f = 0;
		for (i = 0; i <= len - len2;i++)
		{
			ff = 1;
			for (j = 0; j < len2; j++)
			{
				if (sub.charAt(j) != s.charAt(i + j))
				{
				ff = 0;
				break;
				}
			}
			if (ff == 0)
			{
				continue;
			}
			for (j = 0; j < i; j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			System.out.printf("%s",replace);
			for (j = i + len2; j < len; j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			f = 1;
			break;
		}
		if (f == 0)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
