package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int d;
		  int l;
		  int s;
		  int i;
		  int r = 0;
		  int p;
		  int q;
		  String a = new String(new char[10000]);
		  String b = new String(new char[10000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  r = a.charAt(0) - '0';
		  if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' <= 13 && l == 2)
		  {
			  q = 10 * r + a.charAt(1) - '0';
		  r = q % 13;
		  System.out.printf("0\n%d",r);
		  }
		  else if (l == 1)
		  {
			  q = a.charAt(0) - '0';
		  r = q % 13;
		  System.out.printf("0\n%d",r);
		  }
		 else
		 {

		  for (i = 1;i < l;i++)
		  {
							q = 10 * r + a.charAt(i) - '0';
							p = q / 13;
							r = q % 13;
							b = tangible.StringFunctions.changeCharacter(b, i - 1, p + '0');
		  }
		  s = b.length();
		  if (b.charAt(0) == '0' && s > 1)
		  {
			  {
				  for (i = 0;i < s - 1;b[i] = b.charAt(i + 1),i++)
				  {
					  ;
				  }
		  }
			  b = tangible.StringFunctions.changeCharacter(b, s - 1, '\0');
		  }
		  b = tangible.StringFunctions.changeCharacter(b, s, '\0');
		  System.out.printf("%s\n%d",b,r);
		 }
	}
}

