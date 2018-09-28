package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[500]);
		String s2 = new String(new char[20]);
		String s3 = new String(new char[20]);
		int i;
		int j;
		int len1;
		int len2;
		int count;
		int c = 0;

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		len1 = s1.length();
		len2 = s2.length();

		for (i = 0;i < len1;i++)
		{
			count = 0;
			if (s1.charAt(i) == s2.charAt(0))
			{
				for (j = 0;j < len2;j++)
				{
					if (s1.charAt(i + j) == s2.charAt(j))
					{
						count++;
					}
				}
			}
			if (count == len2)
			{
				for (j = 0;j < len2;j++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, i + j, s3.charAt(j));
				}
				c++;
			}
			if (c == 1)
			{
				break;
			}
		}
		System.out.println(s1);
		return 0;
	}
}

