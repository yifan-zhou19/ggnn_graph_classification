package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
		int len;
		int i;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0;i < len1;i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1.charAt(i) -= 32;
			}
		}
			for (i = 0;i < len2;i++)
			{
				if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
				{
					s2.charAt(i) -= 32;
				}
			}
				if (len1 <= len2)
				{
					len = len2;
				}
				else
				{
					len = len1;
				}

					for (i = 0;i < len;i++)
					{
						if (s1.charAt(i) < s2.charAt(i))
						{
							System.out.print("<");
							break;
						}
						if (s1.charAt(i) > s2.charAt(i))
						{
							System.out.print(">");
							break;
						}
					}

					if (i == len)
					{
						System.out.print("=");
					}


				return 0;
	}
}
