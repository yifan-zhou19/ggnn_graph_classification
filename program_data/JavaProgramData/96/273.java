package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[105]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  int c = 0;
		  int d = 0;
		  int e;
		  int i = 0;
		  while (a.charAt(i) != '\0')
		  {
						   e = a.charAt(i) - '0';
						   c = d * 10 + e;
						   d = c % 13;
						   a = tangible.StringFunctions.changeCharacter(a, i, c / 13 + '0');
						   i++;
		  }
		  if (a.charAt(1) == '\0')
		  {
			  System.out.print("0");
		  }
		  else if (a.charAt(1) == '0')
		  {
			   if (a.charAt(2) != '\0')
			   {
				   System.out.printf("%s", a.charAt(2));
			   }
			   else
			   {
				   System.out.print("0");
			   }
		  }
		  else
		  {
			  System.out.printf("%s", a.charAt(1));
		  }
		  System.out.print("\n");
		  System.out.printf("%d",d);
	}


}

