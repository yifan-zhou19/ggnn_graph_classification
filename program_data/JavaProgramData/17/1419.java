package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int g;
		  int ans;
		  int max;
		  int temp;
		  int n;
		  int l;
		  int t;
		  String c = new String(new char[1000]);
		  while (scanf("%s",c) != EOF)
		  {
				 System.out.printf("%s\n",c);
						  for (k = 0;k < 100;k++)
						  {
											 for (i = 0;c.charAt(i) != '\0';i++)
											 {
																	if (c.charAt(i) == '(')
																	{
																				 for (j = i + 1;c.charAt(j) != '\0';j++)
																				 {
																										if (c.charAt(j) == '(')
																										{
																													 i = j - 1;
																													 break;
																										}
																										if (c.charAt(j) == ')')
																										{
																													 c = tangible.StringFunctions.changeCharacter(c, i, ' ');
																													 c = tangible.StringFunctions.changeCharacter(c, j, ' ');
																													 break;
																										}
																				 }
																	}
											 }
						  }
						  for (i = 0;c.charAt(i) != '\0';i++)
						  {
												 if (c.charAt(i) == '(')
												 {
													 c = tangible.StringFunctions.changeCharacter(c, i, '$');
												 }
												 else if (c.charAt(i) == ')')
												 {
													 c = tangible.StringFunctions.changeCharacter(c, i, '?');
												 }
												 else
												 {
													 c = tangible.StringFunctions.changeCharacter(c, i, ' ');
												 }
						  }
						  System.out.printf("%s\n",c);
		  }

	}

}

