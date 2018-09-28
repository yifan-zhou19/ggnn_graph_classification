package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str1 = new String(new char[250]);
		  String str2 = new String(new char[250]);
		  String str3 = new String(new char[250]);
		  String str4 = new String(new char[251]);
		  String str5 = new String(new char[251]);
		  int a;
		  int b;
		  int c;
		  int n;
		  int i;
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
		  for (i = 0;i < 250;i++)
		  {
			  a = i;
			  if (str1.charAt(i) == 0)
			  {
			  break;
			  }
		  }
		  for (i = 0;i < 250;i++)
		  {
			  b = i;
			  if (str2.charAt(i) == 0)
			  {
			  break;
			  }
		  }
		  if (a > b)
		  {
				n = a;
				for (i = (a - 1);i >= 0;i--)
				{
					  if (i < (a - b))
					  {
					  str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
					  }
					  else
					  {
					  str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i - (a - b)));
					  }
				}
		  }
		  if (b > a)
		  {
				n = b;
				for (i = (b - 1);i >= 0;i--)
				{
					  if (i < (b - a))
					  {
					  str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
					  }
					  else
					  {
					  str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i - (b - a)));
					  }
				}
		  }
		  if (b == a)
		  {
		  n = a;
		  }
		  for (i = (n - 1);i >= 0;i--)
		  {
			   str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i) + str2.charAt(i) - '0'-'0');
		  }
		  for (i = (n - 1);i > 0;i--)
		  {
			   if (str3.charAt(i) > 9)
			   {
					  str4 = tangible.StringFunctions.changeCharacter(str4, i + 1, str3.charAt(i) - 10);
					  str3 = tangible.StringFunctions.changeCharacter(str3, i - 1, str3.charAt(i - 1) + 1);
			   }
			   else
			   {
				 str4 = tangible.StringFunctions.changeCharacter(str4, i + 1, str3.charAt(i));
			   }
		  }
		  if (str3.charAt(0) > 9)
		  {
			   str4 = tangible.StringFunctions.changeCharacter(str4, 1, str3.charAt(0) - 10);
			   str4 = tangible.StringFunctions.changeCharacter(str4, 0, 1);
		  }
		  else
		  {
			  str4 = tangible.StringFunctions.changeCharacter(str4, 1, str3.charAt(0));
			  str4 = null;
		  }
		  int f = 0;
		  for (i = 0;i <= n;i++)
		  {
			  c = i;
			  if (str4.charAt(i) != 0)
			  {
			  break;
			  }
		  }
		  for (i = c;i <= n;i++)
		  {
			  System.out.printf("%d",str4.charAt(i));
			  f = 1;
		  }
		  if (f == 0)
		  {
		  System.out.printf("%d",f);
		  }

	}

}

