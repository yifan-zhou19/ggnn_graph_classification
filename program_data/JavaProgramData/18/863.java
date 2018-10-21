package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[20000];
	 int[] b = new int[20000];
	 int min;
	 int i;
	 int j;
	 int k;
	 int num;
	 int sum;
	 int n;
	 int m;
	 int x;
	 int y;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (num = 1;num <= n;num++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(b,0,(Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
				  b[i * n + j] = ConsoleInput.readToWhiteSpace(true);

		 }
	 }

	 sum = 0;
	 for (k = n;k > 1;k--)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(a,0,(Integer.SIZE / Byte.SIZE));
		   for (i = 0;i < k;i++)
		   {
				for (j = 0;j < k;j++)
				{
					 a[i * k + j] = (b + i * k + j);
				}
		   }



		   for (i = 0;i < k;i++)
		   {
				   min = 3000;
				for (j = 0;j < k;j++)
				{
					 if (a[i * k + j] < min)
					 {
						 min = a[i * k + j];
					 }
				}
				for (j = 0;j < k;j++)
				{
					 a[i * k + j] = (a + i * k + j) - min;
				}
		   }
		  for (j = 0;j < k;j++)
		  {
				   min = 3000;
				for (i = 0;i < k;i++)
				{
					 if (a[i * k + j] < min)
					 {
						 min = a[i * k + j];
					 }
				}
				for (i = 0;i < k;i++)
				{
					 a[i * k + j] = (a + i * k + j) - min;
				}
		  }

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,(Integer.SIZE / Byte.SIZE));
		 sum = sum + a[k + 1];
		 x = -1;
		 for (i = 0;i < k;i++)
		 {
				 if (i != 1)
				 {
					 x++;
				  y = -1;
				  for (j = 0;j < k;j++)
				  {
					   if (j != 1)
					   {
							y++;
							b[x * k + y - x] = a[i * k + j];
					   }
				  }


				 }
		 }


	 }
	System.out.print(sum);
	System.out.print("\n");
	 }
	return 0;
	}

}

