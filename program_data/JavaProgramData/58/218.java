package <missing>;

public class GlobalMembers
{
	// asdddee.cpp : Defines the entry point for the console application.
	//




	public static int Main()
	{
		String zifu = new String(new char[100]);
	   String a = new String(new char[10]);
	   int n;
	   int p;
	   int i;
	   int j;
	   int l;
		  a = new Scanner(System.in).nextLine();
		   n = Integer.parseInt(a);
			for (i = 0;i < n;i++)
			{
				 zifu = new Scanner(System.in).nextLine();
					 if (zifu.charAt(0) == '_' || (zifu.charAt(0) >= 'A' && zifu.charAt(0) <= 'Z') || (zifu.charAt(0) >= 'a' && zifu.charAt(0) <= 'z'))
					 {
						 l = 1;
							 p = 1;
								   for (j = 1;zifu.charAt(j) != '\0';j++)
								   {
										  if ((zifu.charAt(j) >= 'A' && zifu.charAt(j) <= 'Z') || (zifu.charAt(j) >= 'a' && zifu.charAt(j) <= 'z') || (zifu.charAt(j) >= '0' && zifu.charAt(j) <= '9') || zifu.charAt(j) == '_')
										  {
											  p = 1;
										  }
												 else
												 {
													p = 0;
														break;
												 }
								   }

					 }
					 else
					 {
						 l = 0;
					 }
					 if (l == 0)
					 {
						  System.out.print("0\n");
					 }
								else if (p == 1 && l == 1)
								{
											  System.out.print("1\n");
								}
												   else if (p == 0)
												   {
													   System.out.print("0\n");
												   }
			}



	  return 0;
	}

}
