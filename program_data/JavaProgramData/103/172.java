package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  int i;
		  int n;
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
								 {
								 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
								 }
		  }
		  for (i = 0;a.charAt(i) != '\0';)
		  {
						   n = 0;
						   while (a.charAt(i + 1) == a.charAt(i))
						   {
											  n++;
											  i++;
						   }
						   n++;
						   System.out.printf("(%c,%d)",a.charAt(i),n);
						   i++;
		  }
	}

}

