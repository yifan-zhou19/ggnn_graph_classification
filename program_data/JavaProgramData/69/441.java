package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n1;
		  int n2;
		  int i;
		  int j = 0;
		  int k;
		  int a;
		  int b;
		  String str1 = new String(new char[252]);
		  String str2 = new String(new char[252]);
		  String str3 = new String(new char[252]);
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
		  if (str1.charAt(0) == '0' && str1.charAt(1) == '\0')
		  {
			  System.out.printf("%s",str2);
		  }
		  else
		  {
		  for (a = 0;a < 250;a++)
		  {
		  if (str1.charAt(a) == '0')
		  {
		  for (i = 0;i < 250;i++)
		  {
		  str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i + 1));
		  }
		  }
		  else
		  {
			  break;
		  }
		  }
		  for (a = 0;a < 250;a++)
		  {
		  if (str2.charAt(a) == '0')
		  {
		  for (i = 0;i < 250;i++)
		  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i + 1));
		  }
		  }
		  else
		  {
			  break;
		  }
		  }
		  n1 = str1.length();
		  n2 = str2.length();
		  if (n1 > n2)
		  {
		  for (i = 1;(n1 - i) >= 0;i++)
		  {
		  if (n2 - i < 0)
		  {
			  b = 48;
		  }
		  else
		  {
			  b = str2.charAt(n2 - i);
		  }
		  if ((str1.charAt(n1 - i) + b + j) <= 105)
		  {
		  str3 = tangible.StringFunctions.changeCharacter(str3, n1 - i, str1.charAt(n1 - i) + b - 48 + j);
		  j = 0;
		  }
		  else
		  {
			  str3 = tangible.StringFunctions.changeCharacter(str3, n1 - i, str1.charAt(n1 - i) + b - 58 + j);
		  j = 1;
		  }
		  }
		  if (j == 1)
		  {
		  for (k = 0;n1 - k > 0;k++)
		  {
		  str3 = tangible.StringFunctions.changeCharacter(str3, n1 - k, str3.charAt(n1 - k - 1));
		  }
		  str3 = tangible.StringFunctions.changeCharacter(str3, 0, 49);
		  str3 = tangible.StringFunctions.changeCharacter(str3, n1 + 1, '\0');
		  }
		  else
		  {
			  str3 = tangible.StringFunctions.changeCharacter(str3, n1, '\0');
		  }
		  System.out.printf("%s",str3);
		  }
		  else
		  {
		  for (i = 1;(n2 - i) >= 0;i++)
		  {
		  if (n1 - i < 0)
		  {
			  b = 48;
		  }
		  else
		  {
			  b = str1.charAt(n1 - i);
		  }
		  if ((str2.charAt(n2 - i) + b + j) <= 105)
		  {
		  str3 = tangible.StringFunctions.changeCharacter(str3, n2 - i, str2.charAt(n2 - i) + b - 48 + j);
		  j = 0;
		  }
		  else
		  {
			  str3 = tangible.StringFunctions.changeCharacter(str3, n2 - i, str2.charAt(n2 - i) + b - 58 + j);
		  j = 1;
		  }
		  }
		  if (j == 1)
		  {
		  for (k = 0;n2 - k > 0;k++)
		  {
		  str3 = tangible.StringFunctions.changeCharacter(str3, n2 - k, str3.charAt(n2 - k - 1));
		  }
		  str3 = tangible.StringFunctions.changeCharacter(str3, 0, 49);
		  str3 = tangible.StringFunctions.changeCharacter(str3, n2 + 1, '\0');
		  }
		  else
		  {
			  str3 = tangible.StringFunctions.changeCharacter(str3, n2, '\0');
		  }
		  System.out.printf("%s",str3);
		  }
		  }
	}
}

