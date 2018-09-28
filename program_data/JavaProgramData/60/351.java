package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i += 2)
		{
							for (j = 2;j < i;j++)
							{
											 if (i % j == 0)
											 {
											 break;
											 }
							}
											 if (j == i)
											 {
													   for (j = 2;j < i + 2;j++)
													   {
																		  if ((i + 2) % j == 0)
																		  {
																		  break;
																		  }
													   }
											 }
																		  if (j == i + 2)
																		  {
																			 System.out.printf("%d %d\n",i,i + 2);
																			 z = z + 1;
																		  }
		}
																		  if (z == 0)
																		  {
																		  System.out.print("empty");
																		  }
																	  System.in.read();
																	  System.in.read();
	}

}

