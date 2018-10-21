package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	   int i;
	   int j;
	   String s = new String(new char[101]);
	   s = new Scanner(System.in).nextLine();

	   for (i = 0;s.charAt(i) != '\0';i++)
	   {
		 if ((s.charAt(i) == ' ') && (s.charAt(i + 1) == ' '))
		 {
				{
					for (j = i;s.charAt(j) != '\0';j++)
					{
				 s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
					}
			}
			 i--;
		 }
	   }

	  System.out.println(s);
	  return 0;
	 }
}

