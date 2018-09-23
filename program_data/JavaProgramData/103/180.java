package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  a = new Scanner(System.in).nextLine();
		  int i;
		  int p;
		  i = 0;
		  while (a.charAt(i) != '\0')
		  {
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
				}
				i++;
		  }
		  p = 1;
		  i = 0;
		  while (a.charAt(i + 1) != '\0')
		  {
				if (a.charAt(i) == a.charAt(i + 1))
				{
					 p = p + 1;
				}
				else
				{
					 System.out.printf("(%c,%d)",a.charAt(i),p);
					 p = 1;
				}
				if (a.charAt(i + 2) == '\0')
				{
					 if (a.charAt(i) == a.charAt(i + 1))
					 {
					 System.out.printf("(%c,%d)",a.charAt(i),p);
					 }
					 else
					 {
					 System.out.printf("(%c,%d)",a.charAt(i + 1),p);
					 }
				}
				i++;
		  }
		  if (a.charAt(1) == '\0')
		  {
						 if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
						 {
								a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(0) + 'A'-'a');
								System.out.printf("(%c,%d)",a.charAt(0),1);
						 }
						 else
						 {
								System.out.printf("(%c,%d)",a.charAt(0),1);
						 }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();

	}

}

