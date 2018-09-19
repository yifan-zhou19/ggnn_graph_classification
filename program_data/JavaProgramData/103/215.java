package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1002]);
		  a = new Scanner(System.in).nextLine();
		  int b = 1;
		  int i;
		  for (i = 0; a.charAt(i) != '\0';i++)
		  {
			   if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
			   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			   }
		  }
		  for (i = 1; a.charAt(i) != '\0';i++)
		  {
				  if ((a.charAt(i) == a.charAt(i - 1)))
				  {
				  b = b + 1;
				  }
				  else
				  {
					   System.out.printf("(%c,%d)",a.charAt(i - 1),b);
					   b = 1;
				  }
		  }
		  System.out.printf("(%c,%d)",a.charAt(i - 1),b);
		  System.in.read();
		  System.in.read();
	}

}

