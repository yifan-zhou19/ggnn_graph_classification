package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	String sz = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (int i = 0;i < n;i++)
	{
	   sz = new Scanner(System.in).nextLine();
	   a = sz.length();
		 if (sz.charAt(a - 3) == 'i' && sz.charAt(a - 2) == 'n' && sz.charAt(a - 1) == 'g' && a != 3)
		 {
			   sz = tangible.StringFunctions.changeCharacter(sz, a - 3, '\0');
			   sz = tangible.StringFunctions.changeCharacter(sz, a - 2, '\0');
			   sz = tangible.StringFunctions.changeCharacter(sz, a - 1, '\0');
			   System.out.println(sz);
		 }
		 else if (sz.charAt(a - 2) == 'e' && sz.charAt(a - 1) == 'r' && a != 2)
		 {
					sz = tangible.StringFunctions.changeCharacter(sz, a - 2, '\0');
					sz = tangible.StringFunctions.changeCharacter(sz, a - 1, '\0');
					System.out.println(sz);
		 }
			  else if (sz.charAt(a - 2) == 'l' && sz.charAt(a - 1) == 'y' && a != 2)
			  {
						 sz = tangible.StringFunctions.changeCharacter(sz, a - 2, '\0');
						 sz = tangible.StringFunctions.changeCharacter(sz, a - 1, '\0');
						 System.out.println(sz);
			  }
	}
	return 0;
	}




}

