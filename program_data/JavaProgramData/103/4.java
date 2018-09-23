package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1010]);
		  int l;
		  int i;
		  int j;
		  int k;
		  int x;
		  char c;

		  s = new Scanner(System.in).nextLine();
		  l = s.length();
		  for (i = 0;i < l;i++)
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, Character.toUpperCase(s.charAt(i)));
		  }
		  i = 0;
		  while (i < l)
		  {
				c = s.charAt(i);
				j = i + 1;
				while (j < l && s.charAt(j) == c)
				{
					j++;
				}
				x = j - i;
				System.out.printf("(%c,%d)",c,x);
				i = j;
		  }
		  //puts(s);
		  System.out.print("\n");
		  System.in.read();
		  System.in.read();

	}

}

