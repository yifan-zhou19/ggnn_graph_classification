package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[150]);
		  String b = new String(new char[150]);
		  int i;
		  int l;
		  int c;
		  int d;
		  int e;
		  int f;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  if (l > 2)
		  {
		  if ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0') >= 13)
		  {
				  b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13 + '0');
				  c = (a.charAt(0) - '0') * 10 + (a.charAt(1) - '0');
				  for (i = 1;i <= l - 2;i++)
				  {
					   d = (b.charAt(i - 1) - '0') * 13;
					   c = (c - d) * 10 + (a.charAt(i + 1) - '0');
					   b = tangible.StringFunctions.changeCharacter(b, i, c / 13 + '0');
				  }
		  b = tangible.StringFunctions.changeCharacter(b, l - 1, '\0');
		  f = c - (b.charAt(l - 2) - '0') * 13;
		  System.out.printf("%s\n",b);
		  System.out.printf("%d\n",f);
		  }
		  else
		  {
			  b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) / 13 + '0');
			  c = (a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0');
			  for (i = 1;i <= l - 3;i++)
			  {
						d = (b.charAt(i - 1) - '0') * 13;
						c = (c - d) * 10 + (a.charAt(i + 2) - '0');
						b = tangible.StringFunctions.changeCharacter(b, i, c / 13 + '0');
			  }
		  b = tangible.StringFunctions.changeCharacter(b, l - 2, '\0');
		  f = c - (b.charAt(l - 3) - '0') * 13;
		  System.out.printf("%s\n",b);
		  System.out.printf("%d\n",f);
		  }
		  }
		  else
		  {
			  if (l == 2)
			  {
			  b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13 + '0');
			  b = tangible.StringFunctions.changeCharacter(b, 1, '\0');
			  f = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
			  System.out.printf("%s\n",b);
			  System.out.printf("%d\n",f);

			  }
		  else
		  {

			  b = tangible.StringFunctions.changeCharacter(b, 0, (a.charAt(0) - '0') / 13 + '0');
			  b = tangible.StringFunctions.changeCharacter(b, 1, '\0');
			  f = a.charAt(0) - '0';
			  System.out.printf("%s\n",b);
			  System.out.printf("%d\n",f);
		  }
		  }


	}


}

