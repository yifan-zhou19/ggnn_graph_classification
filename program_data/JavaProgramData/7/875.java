package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String s1 = new String(new char[300]);
		final String s2 = "";
		int i;
		int j;
		int len;
		int count = 0;
		int m;
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
		if (s.charAt(i) == s1.charAt(0))
		{
			for (j = 1;s1.charAt(j) != '\0';j++)
			{
					 if (s.charAt(j + i) != s1.charAt(j))
					 {
						 break;
					 }
			}
					 if (j >= s1.length())
					 {
						 m = i;
						 count = 1;
						 break;
					 }
		}
		}
		if (count != 0)
		{
			for (i = 0;i < m;i++)
			{
		System.out.printf("%c",s.charAt(i));
			}
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",s2.charAt(i));
		}
		for (j = i + m;j < len;j++)
		{
			System.out.printf("%c",s.charAt(j));
		}
		}
		else
		{
			System.out.printf("%s",s);
		}

		return 0;
	}




}
