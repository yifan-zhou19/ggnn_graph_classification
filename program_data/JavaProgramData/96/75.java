package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int d;
		  int q;
		  int r;
		  int l;
		  int i;
		  int m;
		  String dividend = new String(new char[10000]);
		  String quotient = new String(new char[10000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  dividend = tempVar.charAt(0);
		  }
		  l = dividend.length();
		  if (l == 1)
		  {
		  System.out.printf("%c\n%d",'0',dividend.charAt(0) - '0');
		  }
	else
	{
		  r = dividend.charAt(0) - '0';
		  for (i = 1;i < l;i++)
		  {
						  m = dividend.charAt(i) - '0' + 10 * r;
						  q = m / 13;
						  r = m % 13;
						  quotient = tangible.StringFunctions.changeCharacter(quotient, i - 1, q + '0');
		  }
		  quotient = tangible.StringFunctions.changeCharacter(quotient, l - 1, '\0');
		  if (quotient.charAt(0) == '0' && l > 2)
		  {
			  for (i = 0;i < l;quotient[i] = quotient.charAt(i + 1),i++)
			  {
				  ;
			  }
		  }
		  System.out.printf("%s\n%d",quotient,r);
	}
	}
}

