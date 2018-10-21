package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300 * 100]);
		String sub = new String(new char[100]);
		String rep = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
	   int i;
	   int j;
	   int k;
	   int t;
	   int w;
	   t = 0;
	   w = 0;
	   for (i = 0;str.charAt(i) != 0;i++)
	   {
				   if (str.charAt(i) == sub.charAt(0))
				   {
								  for (k = i + 1, j = 1;str.charAt(k) != 0 && sub.charAt(j) != 0;k++, j++)
								  {
												  if (str.charAt(k) != sub.charAt(j))
												  {
												  break;
												  }
								  }
												if (sub.charAt(j) == 0)
												{
										  t = i;
										  w = k;
										  break;
												}
				   }
	   }
										  if (w > t)
										  {
													if (sub.length() >= rep.length())
													{
																				 for (i = t,j = 0;rep.charAt(j) != 0;i++,j++)
																				 {
																				 str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
																				 }
																				 for (k = w;str.charAt(k) != 0;i++,k++)
																				 {
																					   str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
																				 }
																	 str = str.substring(0, i);
													}
																	 else
																	 {
													   i = str.length() + rep.length() - sub.length();
													   for (k = str.length();k >= w;k--,i--)
													   {
																		 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
													   }
													for (i = t,j = 0;rep.charAt(j) != 0;i++,j++)
													{
															str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
													}
																	 }
										  }
															System.out.print(str);

	  return 0;
	}

}

