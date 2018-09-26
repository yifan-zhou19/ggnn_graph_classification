package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String c1 = new String(new char[260]);
		String c2 = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  c1 = tempVar2.charAt(0);
			  }
			  k = 0;
			  for (i = 0;c1.charAt(i) != '\0';i++)
			  {
					 if (c1.charAt(i) == 'A')
					 {
						 c2 = tangible.StringFunctions.changeCharacter(c2, i, 'T');
					 }
					 if (c1.charAt(i) == 'T')
					 {
						 c2 = tangible.StringFunctions.changeCharacter(c2, i, 'A');
					 }
					 if (c1.charAt(i) == 'C')
					 {
						 c2 = tangible.StringFunctions.changeCharacter(c2, i, 'G');
					 }
					 if (c1.charAt(i) == 'G')
					 {
						 c2 = tangible.StringFunctions.changeCharacter(c2, i, 'C');
					 }
					 k++;
			  }
			  for (i = 0;i < k - 1;i++)
			  {
				  System.out.printf("%c",c2.charAt(i));
			  }
			  System.out.printf("%c\n",c2.charAt(k - 1));

		}

		return 0;
	}
}

