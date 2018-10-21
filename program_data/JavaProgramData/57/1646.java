package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String s = new String(new char[100]);
			int k;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			k = s.length();
			String s1 = new String(new char[4]);
			String s2 = new String(new char[3]);
			s1 = tangible.StringFunctions.changeCharacter(s1, 0, s.charAt(k - 3));
			s1 = tangible.StringFunctions.changeCharacter(s1, 1, s.charAt(k - 2));
			s1 = tangible.StringFunctions.changeCharacter(s1, 2, s.charAt(k - 1));
			s1 = tangible.StringFunctions.changeCharacter(s1, 3, '\0');
			s2 = tangible.StringFunctions.changeCharacter(s2, 0, s.charAt(k - 2));
			s2 = tangible.StringFunctions.changeCharacter(s2, 1, s.charAt(k - 1));
			s2 = tangible.StringFunctions.changeCharacter(s2, 2, '\0');
			if (strcmp(s1,"ing") == 0)
			{
				String s3 = new String(new char[100]);
				int j;
				for (j = 0;j < k - 3;j++)
				{
					s3 = tangible.StringFunctions.changeCharacter(s3, j, s.charAt(j));
				}
				s3 = tangible.StringFunctions.changeCharacter(s3, k - 3, '\0');
				System.out.printf("%s\n",s3);
			}
			else if ((strcmp(s2,"ly") == 0) || (strcmp(s2,"er") == 0))
			{
				String s4 = new String(new char[100]);
				int h;
				for (h = 0;h < k - 2;h++)
				{
					s4 = tangible.StringFunctions.changeCharacter(s4, h, s.charAt(h));
				}
				s4 = tangible.StringFunctions.changeCharacter(s4, k - 2, '\0');
				System.out.printf("%s\n",s4);
			}
		}
	}


}

