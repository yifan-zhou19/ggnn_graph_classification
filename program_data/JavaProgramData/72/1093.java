package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int[][] sz = new int[20][20];
	   int i;
	   int k;


	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (k = 0;k < m;k++)
	   {
		 for (i = 0;i < n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[k][i] = Integer.parseInt(tempVar3);
			 }
		 }
	   }

	   for (k = 0;k < m;k++)
	   {

		 if (k == 0)
		 {


		for (i = 0;i < n;i++)
		{
					if (i == 0)
					{

			   if ((sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i + 1]))
			   {
				  System.out.printf("%d %d\n",k,i);
			   }
					}
			 else if (i == n - 1)
			 {
			   if ((sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i - 1]))
			   {
				   System.out.printf("%d %d\n",k,i);
			   }
			 }
			 else
			 {
				  if ((sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i - 1]) && (sz[k][i] >= sz[k][i + 1]))
				  {
					 System.out.printf("%d %d\n",k,i);
				  }
			 }
		}

		 }
		 if ((k != 0) && (k != m - 1))
		 {


			   for (i = 0;i < n;i++)
			   {
					 if (i == 0)
					 {
			   if ((sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i + 1]) && (sz[k][i] >= sz[k - 1][i]))
			   {
				  System.out.printf("%d %d\n",k,i);
			   }
					 }
			 else if (i == n - 1)
			 {
			   if ((sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i - 1]) && (sz[k][i] >= sz[k - 1][i]))
			   {
				 System.out.printf("%d %d\n",k,i);
			   }
			 }
			 else
			 {
				   if ((sz[k][i] >= sz[k - 1][i]) && (sz[k][i] >= sz[k + 1][i]) && (sz[k][i] >= sz[k][i - 1]) && (sz[k][i] >= sz[k][i + 1]))
				   {
					 System.out.printf("%d %d\n",k,i);
				   }
			 }
			   }
		 }
		 if (k == m - 1)
		 {

				for (i = 0;i < n;i++)
				{
					if (i == 0)
					{
			   if ((sz[k][i] >= sz[k - 1][i]) && (sz[k][i] >= sz[k][i + 1]))
			   {
				   System.out.printf("%d %d\n",k,i);
			   }
					}
			 else if (i == n - 1)
			 {
			   if ((sz[k][i] >= sz[k - 1][i]) && (sz[k][i] >= sz[k][i - 1]))
			   {
				   System.out.printf("%d %d\n",k,i);
			   }
			 }
			 else
			 {
				  if ((sz[k][i] >= sz[k - 1][i]) && (sz[k][i] >= sz[k][i - 1]) && (sz[k][i] >= sz[k][i + 1]))
				  {
					  System.out.printf("%d %d\n",k,i);
				  }
			 }
				}
		 }
	   }

	   return 0;
	}
}

