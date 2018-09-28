package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int n;
		int l;
		String s = new String(new char[256]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				k = i;
				l = i;
				for (j = 0;j < a.length();j++,k++)
				{
					if (a.charAt(j) != s.charAt(k))
					{
						break;
					}
				}
				if (j == a.length())
				{
					m = 1;
					break;
				}
			}
		}
		if (m == 1)
		{
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%s",b);
			for (n = l + a.length();n < s.length();n++)
			{
				System.out.printf("%c",s.charAt(n));
			}
		}
		else if (m == 0)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
