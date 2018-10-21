package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
	   String a = new String(new char[80]);
	   String b = new String(new char[80]);
	   a = new Scanner(System.in).nextLine();
	   System.out.print("\n");
	   b = new Scanner(System.in).nextLine();
	   int i;
	   for (i = 0;i < 80;i++)
	   {
		   if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z')
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
		   }
		   if ('A' <= b.charAt(i) && b.charAt(i) <= 'Z')
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
		   }
	   }
	   if (strcmp(a,b) > 0)
	   {
		   System.out.print('>');
	   }
		   if (strcmp(a,b) == 0)
		   {
			   System.out.print('=');
		   }
			   if (strcmp(a,b) < 0)
			   {
				   System.out.print('<');
			   }






	}

}

