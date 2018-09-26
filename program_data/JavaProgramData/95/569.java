package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		int n;

		s1 = new Scanner(System.in).nextLine();
		for (i = 0;i < s1.length();i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1.charAt(i) -= 32;
			}
		}

		s2 = new Scanner(System.in).nextLine();
		for (i = 0;i < s2.length();i++)
		{
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2.charAt(i) -= 32;
			}
		}

		if (s1.length() > s2.length())
		{
			n = s1.length();
		}
		else
		{
			n = s2.length();
		}

		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				  if (i == n - 1)
				  {
					  System.out.print("=\n");
				  }
				  continue;
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
		}


		return 0;

	}



}
