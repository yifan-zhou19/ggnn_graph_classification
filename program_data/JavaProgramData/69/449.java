package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str1 = new String(new char[252]);
		  String str2 = new String(new char[252]);
		  String str = new String(new char[252]);
		  int i;
		  int j;
		  int k;
		  int n;
		  int n1;
		  int n2;
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
		  n1 = str1.length();
		  n2 = str2.length();
		  for (i = n1 - 1;i >= 0;i--)
		  {
		  str1 = tangible.StringFunctions.changeCharacter(str1, i + 251 - n1, str1.charAt(i));
		  }
		  for (i = 0;i < 251 - n1;i++)
		  {
		  str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
		  }
		  for (i = n2 - 1;i >= 0;i--)
		  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, i + 251 - n2, str2.charAt(i));
		  }
		  for (i = 0;i < 251 - n2;i++)
		  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
		  }
		  k = 0;
		  for (i = 250;i >= 0;i--)
		  {

							 str = tangible.StringFunctions.changeCharacter(str, i, str1.charAt(i) + str2.charAt(i) - '0'-'0' + k);
							 if (str.charAt(i) > 9)
							 {
								k = 1;
							str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + '0' - 10);
							 }
							 if (str.charAt(i) <= 9)
							 {
								 k = 0;
							 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + '0');
							 }
		  }
							 for (i = 0;i <= 250;i++)
							 {
												if (str.charAt(i) != '0')
												{
															   n = i;
															   break;

												}
							 }
												if (i == 251)
												{
												System.out.print("0");
												}
												for (i = n;i <= 250;i++)
												{
												System.out.printf("%c",str.charAt(i));
												}









	}

}

