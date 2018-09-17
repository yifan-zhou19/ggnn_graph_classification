package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[1024]);
		  int i;
		  int j;
		  int n;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  d = 'A'-'a';
		  for (i = 0;i <= 1024;i += n)
		  {
								  n = 0;
								  if ('a' <= c.charAt(i) && c.charAt(i) <= 'z')
								  {
														  c.charAt(i) += d;
														  for (j = i;j <= 1024;j++)
														  {
																			  if (c.charAt(j) == c.charAt(i) || c.charAt(j) == c.charAt(i) - d)
																			  {
																				  n++;
																			  }
																			  else
																			  {
																				  break;
																			  }
														  }
														  System.out.printf("(%c,%d)",c.charAt(i),n);
								  }
								  else if ('A' <= c.charAt(i) && c.charAt(i) <= 'Z')
								  {
									   for (j = i;j <= 1024;j++)
									   {
																			  if (c.charAt(j) == c.charAt(i) || c.charAt(j) == c.charAt(i) - d)
																			  {
																				  n++;
																			  }
																			  else
																			  {
																				  break;
																			  }
									   }
														  System.out.printf("(%c,%d)",c.charAt(i),n);
								  }
								  else
								  {
									  break;
								  }
		  }
	}

}

