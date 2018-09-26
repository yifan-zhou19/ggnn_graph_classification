package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int len1;
		  int len2;
		  String str1 = new String(new char[255]);
		  String str2 = new String(new char[255]);
		  String str3 = new String(new char[255]);
		  char c = '0';
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str1 = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  str2 = tempVar2.charAt(0);
		  }
		  String temp = new String(new char[255]);
		  if (str1.length() < str2.length())
		  {
			  temp = str1;
			  str1 = str2;
			  str2 = temp;
		  }
		  len1 = str1.length();
		  len2 = str2.length();
		  str3 = tangible.StringFunctions.changeCharacter(str3, len1, '\0');
		  int jinwei = 0;
		  for (i = len1 - 1;i >= 0;i--)
		  {
			 if (i >= len1 - len2)
			 {
				if (str1.charAt(i) + str2.charAt(i - len1 + len2) - '0'-'0' + jinwei < 10)
				{
				   str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i) + str2.charAt(i - len1 + len2) - '0' + jinwei);
				   jinwei = 0;
				}
				else
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i) + str2.charAt(i - len1 + len2) - '0' + jinwei - 10);
				   jinwei = 1;
				}
			 }
			 else
			 {
				 if (str1.charAt(i) - '0' + jinwei < 10)
				 {
					   str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i) + jinwei);
					   jinwei = 0;
				 }
				 else
				 {
					 str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i) + jinwei - 10);
					 jinwei = 1;
				 }
			 }
		  }
		  int y = 0;
		  if (jinwei == 1)
		  {
			  c = '1';
			  System.out.printf("%c%s",c,str3);
		  }
		  else
		  {
			  if (len1 == 1 && len2 == 1)
			  {
				   System.out.printf("%c",str3.charAt(0));
			  }
		  else
		  {
		  for (i = 0;i < len1;i++)
		  {
			 if (y == 1)
			 {
			   System.out.printf("%c",str3.charAt(i));
			 }
			 else
			 {
			 if (str3.charAt(i) > '0')
			 {
					y = 1;
					System.out.printf("%c",str3.charAt(i));
			 }
			 }
		  }
		  }
		  }

		  return 0;
	}

}

