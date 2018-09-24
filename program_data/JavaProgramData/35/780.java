package <missing>;

public class GlobalMembers
{
	public static int Main()


	{

	 int x;
	 int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		scanf(",");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		   int i;
		   int j;
		   int k;
		   int b = 0;
		   int[][] a = new int[99][99];


		   for (i = 0;i < x;i++)


		   {


				 for (j = 0;j < y;j++)
				 {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
				 }

		   }


		   for (i = 0;i < x;i++)
		   {
				  for (j = 0;j < y;j++)
				  {
						 for (k = j + 1;k < y;k++)
						 {
								if (a[i][j] < a[i][k])
								{
									break;
								}
						 }
						 if (k == y)
						 {
							 break;
						 }
				  }
				 for (k = 0;k < x;k++)
				 {
					  if (a[i][j] > a[k][j])
					  {
						  break;
					  }
				 }
				  if (k == x)
				  {
					  System.out.printf("%d+%d",i,j);
				  }
				  else
				  {
					  b += 1;
				  }
				  if (b == x)
				  {
					  System.out.print("No");
				  };
		   }



	return 0;
	}

}

