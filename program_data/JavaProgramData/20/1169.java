package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		for (;;)
		{
		String s1 = new String(new char[19]);
		String s2 = new String(new char[4]);
		String s3 = new String(new char[20]);
		if (scanf("%s%s",s1,s2) == EOF)
		{
			break;
		}
		int l;
		l = s1.length();
		int i;
		int j;
		int max = 0;
		for (i = 0;i < l;i++)
		{
			if (s1.charAt(i) > s1.charAt(max))
			{
				max = i;
			}
		}
		for (i = 0;i <= max;i++)
		{
			s3 = tangible.StringFunctions.changeCharacter(s3, i, s1.charAt(i));
		}
		for (i = 0,j = max + 1;i < 3;i++,j++)
		{
			s3 = tangible.StringFunctions.changeCharacter(s3, j, s2.charAt(i));
		}
		for (i = max + 1,j = max + 4;i < l;i++,j++)
		{
			s3 = tangible.StringFunctions.changeCharacter(s3, j, s1.charAt(i));
		}
		s3 = tangible.StringFunctions.changeCharacter(s3, l + 3, '\0');
		System.out.println(s3);
		}
	}


}

