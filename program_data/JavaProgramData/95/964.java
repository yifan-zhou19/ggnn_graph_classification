package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String aa = new String(new char[100]);
		String bb = new String(new char[100]);
		 aa = new Scanner(System.in).nextLine();
		 bb = new Scanner(System.in).nextLine();
		 i = 0;
		 while (aa.charAt(i) != '\0')
		 {
				if (aa.charAt(i) <= 122 && aa.charAt(i) >= 97)
				{
				   aa = tangible.StringFunctions.changeCharacter(aa, i, aa.charAt(i) - 32);
				}
				   i++;
		 }
		 i = 0;
		  while (bb.charAt(i) != '\0')
		  {
			 if (bb.charAt(i) <= 122 && bb.charAt(i) >= 97)
			 {
				   bb = tangible.StringFunctions.changeCharacter(bb, i, bb.charAt(i) - 32);
			 }
				   i++;
		  }
		 if (strcmp(aa,bb) < 0)
		 {
		 System.out.print("<");
		 }
		 if (strcmp(aa,bb) == 0)
		 {
		 System.out.print("=");
		 }
		 if (strcmp(aa,bb) > 0)
		 {
		 System.out.print(">");
		 }
		 return 0;
	}
}

