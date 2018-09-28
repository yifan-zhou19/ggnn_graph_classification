package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int len1 = s1.length();
		int len2 = s2.length();
		int i;
		int jh = 1;
		for (i = 0;i <= len1;i++)
		{
		  if (s1.charAt(i) == s2.charAt(i))
		  {
			  continue;
		  }
		  else
		  {
		  if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z' && s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
		  {
			if (s1.charAt(i) - 'A'+'a' < s2.charAt(i))
			{
				System.out.print("<");
				jh = 0;
				break;
			}
			else if (s1.charAt(i) - 'A'+'a' == s2.charAt(i))
			{
				continue;
			}
			else
			{
				System.out.print(">");
				jh = 0;
				break;
			}
		  }
		  else if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z' && s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
		  {
			if (s2.charAt(i) - 'A'+'a' < s1.charAt(i))
			{
				System.out.print(">");
				jh = 0;
				break;
			}
			else if (s2.charAt(i) - 'A'+'a' == s1.charAt(i))
			{
				continue;
			}
			else
			{
				System.out.print("<");
				jh = 0;
				break;
			}
		  }
		  else
		  {
			if (s2.charAt(i) < s1.charAt(i))
			{
				System.out.print(">");
				jh = 0;
				break;
			}
			else if (s2.charAt(i) == s1.charAt(i))
			{
				continue;
			}
			else
			{
				System.out.print("<");
				jh = 0;
				break;
			}
		  }
		  }
		}
		if (jh == 1)
		{
			System.out.print("=\n");
		}
	}
}
