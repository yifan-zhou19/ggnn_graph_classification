package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);
	public static int[] c = new int[101];
	public static void match(int i,int len)
	{
		int k = i + 1;
					  if (c[i] != 0)
					  {
						  while (k < len)
						  {
							  if (a.charAt(k) == '(' && c[k] == 1)
							  {
								  match(k, len);
							  }
									  if (a.charAt(k) == ')' && c[i] == 1 && c[k] == -1)
									  {
										  c[i] = 0;
										  c[k] = 0;
									  }
									  k++;
						  }
					  }
	}


	public static int Main()
	{
		int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (int i = 0;i < n;i++)
		   {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a = tempVar2.charAt(0);
				   }
				   int len = a.length();
				   for (int j = 0;j < len;j++)
				   {
						   if (a.charAt(j) == '(')
						   {
							   c[j] = 1;
						   }
						   else if (a.charAt(j) == ')')
						   {
							   c[j] = -1;
						   }
						   else
						   {
							   c[j] = 0;
						   }
				   }
				   for (int j = 0;j < len;j++)
				   {
					   if (c[j] == 1)
					   {
						   for (int k = j + 1;k < len;k++)
						   {
							   if (c[k] == 1)
							   {
								   break;
							   }
																				if (c[k] == -1)
																				{
																					c[k] = 0;
																					c[j] = 0;
																					j = -1;
																					break;
																				}
						   }
					   }
				   }
				   System.out.printf("%s\n",a);
				   for (int j = 0;j < len;j++)
				   {
					   if (c[j] == 1)
					   {
						   System.out.print("$");
					   }
										   if (c[j] == -1)
										   {
											   System.out.print("?");
										   }
										  if (c[j] == 0)
										  {
											  System.out.print(" ");
										  }
				   }
										  System.out.print("\n");
		   }

	}


}

