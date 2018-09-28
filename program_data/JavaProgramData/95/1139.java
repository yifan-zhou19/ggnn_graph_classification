package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String a1 = new String(new char[40]);
		String a2 = new String(new char[40]);
		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();

		for (i = 0;a1.charAt(i) != '\0';i++)
		{
			if (a1.charAt(i) >= 'A' && a1.charAt(i) <= 'Z')
			{
		a1 = tangible.StringFunctions.changeCharacter(a1, i, a1.charAt(i) - 'A'+'a');
			}
		}
		 for (i = 0;a2.charAt(i) != '\0';i++)
		 {
			if (a2.charAt(i) >= 'A' && a2.charAt(i) <= 'Z')
			{
		a2 = tangible.StringFunctions.changeCharacter(a2, i, a2.charAt(i) - 'A'+'a');
			}
		 }
		 j = 0;
		  if (a1.charAt(j) > a2.charAt(j))
		  {
		  System.out.print(">");
		  }
		  if (a1.charAt(j) < a2.charAt(j))
		  {
			  System.out.print("<");
		  }
		 while ((a1.charAt(j) == a2.charAt(j)) && (a1.charAt(j) != '\0') && (a2.charAt(j) != '\0'))
		 {
			 j++;
		 if (a1.charAt(j) == '\0' && a2.charAt(j) == '\0')
		 {
			  System.out.print("=");
		 }
		  if (a1.charAt(j) > a2.charAt(j))
		  {
		  System.out.print(">");
		  }
		  if (a1.charAt(j) < a2.charAt(j))
		  {
			  System.out.print("<");
		  }
		 }
	}
}

