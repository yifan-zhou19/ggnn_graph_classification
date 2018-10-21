package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[1024]);
	   String src = new String(new char[1024]);
	   String tar = new String(new char[1024]);
	   String tmp = new String(new char[1024]);
	   str = new Scanner(System.in).nextLine();
	   src = new Scanner(System.in).nextLine();
	   tar = new Scanner(System.in).nextLine();

	   int cnt = 0;

	   if (str.charAt(0) == ' ')
	   {
		   System.out.print(str.charAt(0));
	   }
	   else
	   {
		   tmp = tangible.StringFunctions.changeCharacter(tmp, cnt++, str.charAt(0));
	   }

	   for (int i = 1; str.charAt(i); i++)
	   {

		   if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')
		   {
			   tmp = tangible.StringFunctions.changeCharacter(tmp, cnt++, str.charAt(i));

		   }
		   else if (str.charAt(i) == ' ')
		   {
			   if (cnt > 0)
			   {
				   tmp = tmp.substring(0, cnt);
				   if (!strcmp(tmp, src))
				   {
					   System.out.printf("%s", tar);
				   }
				   else
				   {
					   System.out.printf("%s", tmp);
				   }
				   cnt = 0;
			   }

			   System.out.print(' ');
		   }
		   else
		   {
			   tmp = tangible.StringFunctions.changeCharacter(tmp, cnt++, str.charAt(i));
		   }
	   }
	   if (cnt > 0)
	   {
			 tmp = tmp.substring(0, cnt);
			 if (!strcmp(tmp, src))
			 {
					   System.out.printf("%s", tar);
			 }
				   else
				   {
					   System.out.printf("%s", tmp);
				   }
	   }
	   System.out.print('\n');
	}
}

