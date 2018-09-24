package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int l;
	 int i;
	 int k = 0;
	 int nSpace = 0;
	 String a = new String(new char[1000]);
	 String b = new String(new char[1000]);
	 a = new Scanner(System.in).nextLine();
	 for (i = 0;a.charAt(i) != '\0';i++)
	 {
	   if (nSpace < 1)
	   {
		 b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
		 k++;
	   }
	   if (a.charAt(i) == ' ')
	   {
		 nSpace++;
	   }
	   if (a.charAt(i + 1) != ' ')
	   {
		 nSpace = 0;
	   }
	 }
	 b = tangible.StringFunctions.changeCharacter(b, k, '\0');
	 System.out.println(b);
	 return 0;
	}
}

