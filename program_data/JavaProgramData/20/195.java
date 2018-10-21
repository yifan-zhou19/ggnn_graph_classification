package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s;
		for (;;)
		{
			String str1 = new String(new char[100]);
			String str2 = new String(new char[5]);
			final String str3 = "";
			char m;
			int i;
			int j;
			int l;
			s = scanf("%s %s", str1, str2);
			if (s != 2)
			{
				break;
			}
			else
			{
				for (i = 0,m = str1.charAt(0);i < str1.length();i++)
				{
				if (m < str1.charAt(i))
				{
			  m = str1.charAt(i);
				}
				}
		   for (i = 0;i < str1.length();i++)
		   {
			 if (str1.charAt(i) == m)
			 {
				l = i;
				break;
			 }
		   }
			 for (i = 0;i <= l;i++)
			 {
						 str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i));
			 }
						 for (i = 0;i < 3;i++)
						 {
						str3 = tangible.StringFunctions.changeCharacter(str3, l + 1 + i, str2.charAt(i));
						 }
						 for (i = 0;i < (str1.length() - l - 1);i++)
						 {
							 str3 = tangible.StringFunctions.changeCharacter(str3, l + 4 + i, str1.charAt(l + i + 1));
						 }
						 System.out.printf("%s\n",str3);

			}
		}
	}
}

