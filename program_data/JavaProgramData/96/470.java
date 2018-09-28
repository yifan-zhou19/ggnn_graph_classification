package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String x = new String(new char[100]);
	  final String y = "";
	  int i;
	  int a;
	  int b;
	  int c;
	  int d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = tempVar.charAt(0);
	  }
		if (x.charAt(1) == '\0')
		{
		y = tangible.StringFunctions.changeCharacter(y, 0, '0');
		}
	   c = x.charAt(0) - '0';
	  for (i = 1;x.charAt(i) != '\0';i++)
	  {
		  a = x.charAt(i) - '0';
		  b = c * 10 + a;
		  if (b >= 13)
		  {
			  c = b % 13;
			  d = b / 13;
			  y = tangible.StringFunctions.changeCharacter(y, i - 1, '0' + d);
		  }
		  else
		  {
			   c = b;
			   y = tangible.StringFunctions.changeCharacter(y, i - 1, '0');
		  }
	  }
	  if (y.charAt(0) == '0' && x.charAt(1) != '\0' && x.charAt(2) != '\0')
	  {
		for (i = 0;y.charAt(i) != '\0';i++)
		{
		y = tangible.StringFunctions.changeCharacter(y, i, y.charAt(i + 1));
		}
	  }
	  System.out.printf("%s\n%d",y,c);

	}

}

