package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[250]);
		  String b = new String(new char[250]);
		  String sum = new String(new char[251]);
		  int i;
		  int j = 0;
		  int k;
		  int l = 1;
		  int x;
		  int y;
		  for (i = 0;i < 250;i++)
		  {
			   a = tangible.StringFunctions.changeCharacter(a, i, '0');
		  }
		  for (i = 0;i < 250;i++)
		  {
			   b = tangible.StringFunctions.changeCharacter(b, i, '0');
		  }
		  for (i = 0;i < 251;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, i, '0');
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead("\n");
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  x = a.length();
		  y = b.length();
		  for (i = 0;i < x;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, 250 - i, a.charAt(x - 1 - i));
		  }
		  for (i = 0;i < x;i++)
		  {
			   a = tangible.StringFunctions.changeCharacter(a, i, '0');
		  }
		  for (i = 0;i < x;i++)
		  {
			   a = tangible.StringFunctions.changeCharacter(a, 249 - i, sum.charAt(250 - i));
		  }
		  for (i = 0;i < 251;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, i, '0');
		  }
		  for (i = 0;i < y;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, 250 - i, b.charAt(y - 1 - i));
		  }
		  for (i = 0;i < y;i++)
		  {
			   b = tangible.StringFunctions.changeCharacter(b, i, '0');
		  }
		  for (i = 0;i < y;i++)
		  {
			   b = tangible.StringFunctions.changeCharacter(b, 249 - i, sum.charAt(250 - i));
		  }
		  for (i = 0;i < 251;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, i, '0');
		  }
		  for (i = 0;i < 250;i++)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, 250 - i, (a.charAt(249 - i) - '0') + (b.charAt(249 - i) - '0'));
		  }
		  for (i = 0;i < 250;i++)
		  {
			   if (sum.charAt(250 - i) + j >= 10)
			   {
					 sum = tangible.StringFunctions.changeCharacter(sum, 250 - i, sum.charAt(250 - i) + j - 10 + '0');
					 j = 1;
			   }
			   else
			   {
					 sum = tangible.StringFunctions.changeCharacter(sum, 250 - i, sum.charAt(250 - i) + j + '0');
					 j = 0;
			   }
		  }
		  if (j == 1)
		  {
			   sum = tangible.StringFunctions.changeCharacter(sum, 0, '1');
		  }
		  for (i = 0;i < 251;i++)
		  {
			   l = l + 1;
			   if (sum.charAt(i) >= '1' && sum.charAt(i) <= '9')
			   {
					 k = i;
					 break;
			   }
		  }
		  if (l == 252)
		  {
			   System.out.printf("%c",sum.charAt(0));
		  }
		  else
		  {
			   for (i = k;i < 251;i++)
			   {
					System.out.printf("%c",sum.charAt(i));
			   }
		  }

	}

}

