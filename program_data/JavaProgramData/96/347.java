package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int b;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  for (i = 0;a.charAt(i + 1) != '\0';i++)
		  {
				 b = 10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0';
				 a = tangible.StringFunctions.changeCharacter(a, i + 1, b % 13 + '0');
				 a = tangible.StringFunctions.changeCharacter(a, i, b / 13 + '0');
				 if (a.charAt(0) != '0' || a.charAt(2) == '\0')
				 {
				 System.out.printf("%c",a.charAt(i));
				 }
				 a.charAt(0)++;
		  }
		  if (a.charAt(1) == '\0')
		  {
		  System.out.printf("0\n%c",a.charAt(0));
		  }
		  else
		  {
			  System.out.printf("\n%d",b % 13);
		  }
	}

}

