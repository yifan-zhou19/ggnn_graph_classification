package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[260]);
		String s1 = new String(new char[260]);
		String s2 = new String(new char[260]);
		String s3 = new String(new char[260]);
		int i;
		int j;
		int k;
		int l;
		int h;
		int len;
		int len1;
		int len2;
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len = s.length();
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0,h = 0;i < len;i++,h++)
		{

			s3 = tangible.StringFunctions.changeCharacter(s3, h, s.charAt(i));
			if (s.charAt(i) == s1.charAt(0))
			{
				int e = 1;
				for (j = 0,k = i;j < len1;j++,k++)
				{
					if (s.charAt(k) != s1.charAt(j))
					{
						e = 0;
						break;
					}
				}
			if (e != 0)
			{
				for (l = 0;l < len2;l++,h++)
				{
					s3 = tangible.StringFunctions.changeCharacter(s3, h, s2.charAt(l));
				}
				h--;
				i = i + len1 - 1;
				s1 = tangible.StringFunctions.changeCharacter(s1, 0, '.');

			}
			}
		}
		s3 = tangible.StringFunctions.changeCharacter(s3, len - len1 + len2, '\0');
		System.out.printf("%s",s3);
		return 0;
	}


}

