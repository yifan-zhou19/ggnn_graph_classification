package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int count = 1;
		  String a = new String(new char[2000]);
		  for (i = 0;i < 2000;i++)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		  }
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < 2000;i++)
		  {
							 if (a.charAt(i) == '\0')
							 {
								 break;
							 }
							 if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) == a.charAt(i + 1) + ('A'-'a') || a.charAt(i) == a.charAt(i + 1) - ('A'-'a'))
							 {
								 count++;
							 }
							 else
							 {
								 if (a.charAt(i) >= 'a')
								 {
									 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a'-'A'));
								 }
								 System.out.printf("(%c,%d)",a.charAt(i),count);
								 count = 1;
							 }
		  }
	}
}

