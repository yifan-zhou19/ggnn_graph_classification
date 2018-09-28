package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[300]);
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = tempVar2.charAt(0);
						 }
						 for (j = 0;a.charAt(j) != '\0';j++)
						 {
												if (a.charAt(j) == 'A')
												{
												a = tangible.StringFunctions.changeCharacter(a, j, 'T');
												}
												else if (a.charAt(j) == 'T')
												{
												a = tangible.StringFunctions.changeCharacter(a, j, 'A');
												}
												else if (a.charAt(j) == 'C')
												{
												a = tangible.StringFunctions.changeCharacter(a, j, 'G');
												}
												else if (a.charAt(j) == 'G')
												{
												a = tangible.StringFunctions.changeCharacter(a, j, 'C');
												}
						 }
						 System.out.printf("%s\n",a);
		}

		return EXIT_SUCCESS;
	}

}

