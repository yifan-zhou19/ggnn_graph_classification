package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[max + 1]);
	   String b = new String(new char[max + 1]);
	   int i;
	   int j = 0;
	   a = new Scanner(System.in).nextLine();
	   for (i = 0;a.charAt(i) != '\0';i++)
	   {
		   if (!(a.charAt(i) == ' ' && a.charAt(i + 1) == ' '))
		   {
		   b = tangible.StringFunctions.changeCharacter(b, j++, a.charAt(i));
		   }
	   }
	   b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	System.out.printf("%s",b);
	return 0;
	}

}

