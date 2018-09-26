package <missing>;

public class GlobalMembers
{
	public static void sum(String str1, String str2, int m, int n)
	{
		  String str3 = new String(new char[251]);
		  char b;
		  int i;
		  int a;
		  int x;
		  int y = 0;
		  a = n - m;
		  for (i = n - 1;i >= 0;i--)
		  {
			 if (i < a)
			 {
				 str3 = tangible.StringFunctions.changeCharacter(str3, i, str2[i]);
			 }
			 else
			 {
			 b = str2[i] + str1[i - a] - 48;
			 if (b > 57)
			 {
					str3 = tangible.StringFunctions.changeCharacter(str3, i, b - 10);
					str2[i - 1] = str2[i - 1].Substring(1);
					for (x = i - 1;x >= 0;x--)
					{
						if (str2[x].equals(58))
						{
							str2[x] = '0';
							str2[x - 1] = str2[x - 1].Substring(1);
						}
					}
			 }
			else
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, i, b);
			}
			 }
		  }
		  for (i = 0;;i++)
		  {
			  if (str3.charAt(i) == '0')
			  {
				  y++;
			  }
			  else
			  {
				  break;
			  }
		  }
		  if (y == n)
		  {
			  System.out.printf("%c",'0');
		  }
		  else
		  {
			  for (i = y;i < n;i++)
			  {
		   System.out.printf("%c",str3.charAt(i));
			  }
		  }
	}
	public static int Main()
	{
		 String str1 = new String(new char[251]);
		 String str2 = new String(new char[251]);
		 String str3 = new String(new char[251]);
		 String str4 = new String(new char[251]);
		 int i;
		 int m = 0;
		 int n = 0;
		 int b;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 str1 = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 str2 = tempVar2.charAt(0);
		 }
		 for (i = 0;str1.charAt(i) != '\0';i++)
		 {
		   m = m + 1;
		 }
		 for (i = 0;str2.charAt(i) != '\0';i++)
		 {
		   n = n + 1;
		 }
		 if (m > n)
		 {
			  b = n;
			  n = m;
			  m = b;
			  for (i = 0;i <= n;i++)
			  {
				 if (i == 0)
				 {
					 str3 = tangible.StringFunctions.changeCharacter(str3, i, '0');
				 }
				 else
				 {
					 str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i - 1));
				 }
			  }

			  sum(str2, str3, m, n + 1);
		 }
		 else
		 {
			 for (i = 0;i <= n;i++)
			 {
				 if (i == 0)
				 {
					 str4 = tangible.StringFunctions.changeCharacter(str4, i, '0');
				 }
				 else
				 {
					 str4 = tangible.StringFunctions.changeCharacter(str4, i, str2.charAt(i - 1));
				 }
			 }
			 sum(str1, str4, m, n + 1);
		 }

	}

}

