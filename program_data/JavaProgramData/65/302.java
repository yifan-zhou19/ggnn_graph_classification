package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int a = 0;
		  int b = 0;
		  int[] p = new int[200];
		  int[] q = new int[200];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  p[i] = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  q[i] = Integer.parseInt(tempVar3);
				  }
				  if (p[i] != q[i])
				  {
					if (p[i] == 0)
					{
						  if (q[i] == 1)
						  {
							a = a + 1;
						  }
						  else
						  {
							b = b + 1;
						  }
					}

					else if (p[i] == 1)
					{
							   if (q[i] == 0)
							   {
								  b = b + 1;
							   }
							   else
							   {
								  a = a + 1;
							   }
					}
					   else
					   {
						   if (q[i] == 0)
						   {
							  a = a + 1;
						   }
						   else
						   {
							 b = b + 1;
						   }
					   }
				  }



		  }


		  if (a > b)
		  {
			 System.out.print("A\n");
		  }
		  else if (a < b)
		  {
				 System.out.print("B\n");
		  }
			   else
			   {
				 System.out.print("Tie");
			   }

	}

}

