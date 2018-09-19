package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	  String str = new String(new char[200]);
	  String str1 = new String(new char[200]);
	  while (scanf("%s",str1) != EOF)
	  {
							 int m;
	  m = str1.length();
	  str = str1;
	  int i;
	  int j;
	  for (i = 1;i < m;i++)
	  {
					  for (j = 0;j < m;j++)
					  {
										if (i + j < m)
										{
												 if (str.charAt(j) == '(' && str.charAt(j + i) == ')')
												 {
																			   str = tangible.StringFunctions.changeCharacter(str, j, 'a');
																			   str = tangible.StringFunctions.changeCharacter(str, j + i, 'a');
												 }
										}
					  }
	  }
	  for (i = 0;i < m;i++)
	  {
					  if (str.charAt(i) == '(')
					  {
						  str = tangible.StringFunctions.changeCharacter(str, i, '$');
					  }
					  else if (str.charAt(i) == ')')
					  {
						  str = tangible.StringFunctions.changeCharacter(str, i, '?');
					  }
					  else
					  {
						  str = tangible.StringFunctions.changeCharacter(str, i, ' ');
					  }
	  }
	  System.out.printf("%s\n",str1);
	  System.out.printf("%s\n",str);

	  }

	}

}

