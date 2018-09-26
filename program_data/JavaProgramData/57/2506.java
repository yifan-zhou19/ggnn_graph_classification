package <missing>;

public class GlobalMembers
{
	public static void houzhui()
	{
	  int len;
	  String str = new String(new char[32]);
	  str = new Scanner(System.in).nextLine();
	  len = str.length();
	  if ((str.charAt(len - 2) == 'e' && str.charAt(len - 1) == 'r') || (str.charAt(len - 2) == 'l' && str.charAt(len - 1) == 'y'))
	  {
		str = tangible.StringFunctions.changeCharacter(str, len - 2, '\0');
	  }
	  if (str.charAt(len - 3) == 'i' && str.charAt(len - 2) == 'n' && str.charAt(len - 1) == 'g')
	  {
		str = tangible.StringFunctions.changeCharacter(str, len - 3, '\0');
	  }
	  System.out.println(str);
	}

	public static int Main()
	{
		  int a;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (i = 0;i < a;i++)
		  {
			houzhui();
		  }
	}

}

