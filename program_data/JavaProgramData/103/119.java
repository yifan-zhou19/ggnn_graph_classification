package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  char c = 1;
		  char i;
		  char n;
		  a = new Scanner(System.in).nextLine();
		  for (n = 0;a.charAt(n) != '\0';n++)
		  {
								   if (a.charAt(n) >= 'a' && a.charAt(n) <= 'z')
								   {
								   a.charAt(n) += 'A'-'a';
								   }
								   else
								   {
								   a = tangible.StringFunctions.changeCharacter(a, n, a.charAt(n));
								   }
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 if (a.charAt(i + 1) == a.charAt(i))
								 {
								 c++;
								 }
								 else
								 {
								 System.out.printf("(%c,%d)",a.charAt(i),c);
								 c = 1;
								 }
		  }
	}

}

