package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[1000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str = tempVar.charAt(0);
	  }
	  int a;
	  int b;
	  char n;
	  a = 0;
	  b = 1;
	  while (str.charAt(a) != '\0')
	  {
			str = tangible.StringFunctions.changeCharacter(str, a, Character.toUpperCase(str.charAt(a)));
			a++;
	  }
	  a = 0;
	  while (str.charAt(a) != '\0')
	  {
		n = str.charAt(a);
		if (n == str.charAt(a + 1))
		{
		b = b + 1;
		}
		else
		{
			System.out.printf("(%c,%d)",n,b);
			b = 1;
		}
		  a++;
	  }


	}

}

