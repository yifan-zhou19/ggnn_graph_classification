package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int k;
		String s1 = new String(new char[12]);
		String s2 = new String(new char[5]);
		String s3 = new String(new char[20]);
		while (scanf("%s%s",s1,s2) != EOF)
		{
			int point;
			int i;
			char record;
			len = s1.length();
			record = s1.charAt(0);
			point = 0;
			k = 0;
			for (i = 0;i <= len - 1;i++)
			{
				if (s1.charAt(i) > record)
				{
					record = s1.charAt(i);
					point = i;
				}
			}
			for (i = 0;i <= point;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, k, s1.charAt(i));
				k++;
			}
			for (i = 0;i <= s2.length() - 1;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, k, s2.charAt(i));
				k++;
			}
			for (i = point + 1;i <= len - 1;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, k, s1.charAt(i));
				k++;
			}
			s3 = tangible.StringFunctions.changeCharacter(s3, k, '\0');
			System.out.printf("%s",s3);
			System.out.print("\n");
		}
	}
}

