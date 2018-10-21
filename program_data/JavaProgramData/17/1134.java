package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int count;
		  int mz;
		  final String a = "";
		  String b = new String(new char[200]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		  for (i = 0;i < n;i++)
		  {
						  count = 0;
						  for (j = 0;j < 200;j++)
						  {
											a = tangible.StringFunctions.changeCharacter(a, j, '\0');
											b = tangible.StringFunctions.changeCharacter(b, j, '\0');
						  }
						  a = new Scanner(System.in).nextLine();
						  b = a;
						  for (j = 0;j < 200;j++)
						  {
											if (a.charAt(j) == '\0')
											{
												break;
											}
											count++;
						  }
						  for (j = count - 1;j >= 0;j--)
						  {
											   if (b.charAt(j) == '(')
											   {
															mz = 0;
															for (k = j;k < count;k++)
															{
																				if (b.charAt(k) == ')')
																				{
																							 b = tangible.StringFunctions.changeCharacter(b, k, ' ');
																							 b = tangible.StringFunctions.changeCharacter(b, j, ' ');
																							 mz = 1;
																							 break;
																				}
															}
															if (mz == 0)
															{
																b = tangible.StringFunctions.changeCharacter(b, j, '$');
															}
											   }
						  }
						  for (j = 0;j < count;j++)
						  {
											  if (b.charAt(j) == ')')
											  {
												  b = tangible.StringFunctions.changeCharacter(b, j, '?');
											  }
						  }
						  for (j = 0;j < count;j++)
						  {
							  System.out.printf("%c",a.charAt(j));
						  }
						  System.out.print("\n");
						  for (j = 0;j < count;j++)
						  {
											  if (b.charAt(j) != '$' && b.charAt(j) != '?')
											  {
												  System.out.print(" ");
											  }
											  else
											  {
												  System.out.printf("%c",b.charAt(j));
											  }
						  }
	System.out.print("\n");
		  }
	}
}

