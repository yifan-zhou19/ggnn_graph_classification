package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str1 = new String(new char[251]);
		  String str2 = new String(new char[251]);
		  String str = new String(new char[289]);
		  int i;
		  int m;
		  int n;
		  int z;
		  int x;
		  int t;
		  int l = 0;
		  for (i = 0;i <= 251;i++)
		  {
		  str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		  }
		  str1 = new Scanner(System.in).nextLine();
		  str2 = new Scanner(System.in).nextLine();
		  m = str1.length();
		  n = str2.length();
		  z = 0;

		  if (m < n)
		  {
				   for (i = n - 1;i >= n - m;i--)
				   {
				   x = str1.charAt(i - n + m) + str2.charAt(i) - '0'-'0' + z;
				   if (x < 10)
				   {
					   str = tangible.StringFunctions.changeCharacter(str, i + 1, x + '0',z = 0);
				   }
				   else
				   {
					   str = tangible.StringFunctions.changeCharacter(str, i + 1, x - 10 + '0',z = 1);
				   }
				   }
				   for (i = n - m - 1;i >= 0;i--)
				   {
						x = str2.charAt(i) + z - '0';
						if (x < 10)
						{
							str = tangible.StringFunctions.changeCharacter(str, i + 1, x + '0',z = 0);
						}
						else
						{
							str = tangible.StringFunctions.changeCharacter(str, i + 1, x - 10 + '0',z = 1);
						}
				   }
				   if (z == 1)
				   {
					   str = tangible.StringFunctions.changeCharacter(str, 0, '1');
				   }
				   else
				   {
					   str = tangible.StringFunctions.changeCharacter(str, 0, '0');
				   }
		  }
		  else if (m >= n)
		  {
				   for (i = m - 1;i >= m - n;i--)
				   {
				   x = str2.charAt(i - m + n) + str1.charAt(i) - '0'-'0' + z;
				   if (x < 10)
				   {
					   str = tangible.StringFunctions.changeCharacter(str, i + 1, x + '0',z = 0);
				   }
				   else
				   {
					   str = tangible.StringFunctions.changeCharacter(str, i + 1, x - 10 + '0',z = 1);
				   }
				   }
				   for (i = m - n - 1;i >= 0;i--)
				   {
						x = str1.charAt(i) + z - '0';
						if (x < 10)
						{
							str = tangible.StringFunctions.changeCharacter(str, i + 1, x + '0',z = 0);
						}
						else
						{
							str = tangible.StringFunctions.changeCharacter(str, i + 1, x - 10 + '0',z = 1);
						}
				   }
				   if (z == 1)
				   {
					   str = tangible.StringFunctions.changeCharacter(str, 0, '1');
				   }
				   else
				   {
					   str = tangible.StringFunctions.changeCharacter(str, 0, '0');
				   }
		  }

		  t = str.length();
		  for (i = 0;i <= t - 1;i++)
		  {
			   if (str.charAt(i) != '0')
			   {
				   break;
			   }
			   else
			   {
				   l++;
			   }
		  }
		  if (l != 0 && l != t)
		  {
		  for (i = 0;i <= t;i++)
		  {
			  str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i + l));
		  }
		  }
		  else if (l == t)
		  {
			  str = tangible.StringFunctions.changeCharacter(str, 0, '0',str[1] = '\0');
		  }
		  System.out.printf("%s",str);

	}


}

