package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= t;i++)
		  {
						int l;
						int j;
						int k;
						int m;
						String a = new String(new char[100000]);
						a = new Scanner(System.in).nextLine();
						l = a.length();
						for (j = 0;j < l;j++)
						{
						   m = 0;
						   for (k = 0;k < j;k++)
						   {
										 if (a.charAt(j) == a.charAt(k))
										 {
											   m = 1;
											   break;
										 }
						   }
						   if (m == 0)
						   {
								   for (k = j + 1;k < l;k++)
								   {
										if (a.charAt(j) == a.charAt(k))
										{
											   m = 1;
											   break;
										}
								   }
						   }
						  if (m == 0 && i != t)
						  {
						   System.out.printf("%c\n",a.charAt(j));
						   break;
						  }
						  if (m == 0 && i == t)
						  {
							   System.out.printf("%c",a.charAt(j));
									break;
						  }
						}
					   if (m == 1 && i != t)
					   {
					   System.out.print("no\n");
					   }
					   if (m == 1 && i == t)
					   {
					   System.out.print("no");
					   }
		  }
		  System.in.read();
		  System.in.read();
	}

}

