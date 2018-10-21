package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
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
		for (int j = 0;sz.charAt(j);j++)
		{
			 if (sz.charAt(j) == 'A')
			 {
				 sz = tangible.StringFunctions.changeCharacter(sz, j, 'T');
			 }
		  else if (sz.charAt(j) == 'T')
		  {
			  sz = tangible.StringFunctions.changeCharacter(sz, j, 'A');
		  }
			   else if (sz.charAt(j) == 'G')
			   {
				   sz = tangible.StringFunctions.changeCharacter(sz, j, 'C');
			   }
					else if (sz.charAt(j) == 'C')
					{
						sz = tangible.StringFunctions.changeCharacter(sz, j, 'G');
					}
		}
	   System.out.println(sz);
	}
	return 0;
	}



}

