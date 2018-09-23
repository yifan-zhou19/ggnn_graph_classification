package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[10000]);
	  a = new Scanner(System.in).nextLine();
	  int i;
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
		{
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + ('A'-'a'));
		}
	  }
		int count = 1;
		 for (i = 0;a.charAt(i) != '\0';i++)
		 {
		   if (a.charAt(i + 1) == a.charAt(i))
		   {
				 count++;
		   }
		   else
		   {
				System.out.printf("(%c,%d)",a.charAt(i),count);
				count = 1;
		   }
		 }









	}
}

