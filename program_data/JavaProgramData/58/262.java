package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  int i;
		  int j;
		  String x = new String(new char[100]);
		  for (j = 0;j < n;j++)
		  {
						  x = new Scanner(System.in).nextLine();
						  if (x.charAt(0) == '_' || (x.charAt(0) >= 'A' && x.charAt(0) <= 'z'))
						  {
															   if (x.charAt(1) == '\0')
															   {
																	System.out.print("1\n");
																	continue;
															   }
						  }
						  else
						  {
							  System.out.print("0\n");
							  continue;
						  }
						  for (i = 1;x.charAt(i) != '\0';i++)
						  {
												 if (x.charAt(i) == '_' || (x.charAt(i) >= 'A' && x.charAt(i) <= 'z') || (x.charAt(i) >= '0' && x.charAt(i) <= '9'))
												 {
														  continue;
												 }
												 else
												 {
														  System.out.print("0\n");
														  break;
												 }
						  }
						  if (x.charAt(i) == '\0')
						  {
							  System.out.print("1\n");
						  }
		  }
	}


}

