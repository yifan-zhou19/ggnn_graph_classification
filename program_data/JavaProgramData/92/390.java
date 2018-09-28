package <missing>;

public class GlobalMembers
{
	public static void h(int[] x, int y)
	{
		int i;
		int j;
		int t;
	  for (i = 1;i < y;i++)
	  {
		 for (j = y;j > i;j--)
		 {
		 if (x[j] > x[j - 1])
		 {
		   t = x[j - 1];
			 x[j - 1] = x[j];
			 x[j] = t;
		 }
		 }
	  }
	}

	   public static void g(int[] x, int y)
	   {
		int i;
		int j;
		int t;
		 for (i = 1;i < y;i++)
		 {
		 for (j = y;j > i;j--)
		 {
		 if (x[j] < x[j - 1])
		 {
		   t = x[j - 1];
			 x[j - 1] = x[j];
			 x[j] = t;
		 }
		 }
		 }
	   }

	public static void c(int[] b, int m, int n)
	{
		int i;
		  for (i = n;i <= m;i++)
		  {
			   b[i] = b[i + 1];
		  }
	}
	public static int duma(int n, int[] a1, int[] a2)
	{
		int a = 0;
		int i = 0;
		for (i = n;i != 1;i--)
		{
			   if (a1[0] > a2[0]) //?????????????????
			   {
				   a += 200;
				   for (int k = 0;k < i - 1;k++)
				   {
						   a1[k] = a1[k + 1];
						   a2[k] = a2[k + 1];
				   }
			   }
			   else
			   {
				  if (a1[0] < a2[0]) //?????????????????
				  {
						 a -= 200;
					 for (int k = 0;k < i - 1;k++)
					 {
						   a2[k] = a2[k + 1];
					 }
				  }
				  else
				  {
					  if (a1[i - 1] > a2[i - 1]) //?????????????????
					  {
							 a += 200;
					  }
					  else //?????????????????
					  {
						  if (a1[i - 1] < a2[0])
						  {
							 a -= 200;
						  }
						  else
						  {
							  a = a;
						  }
							 for (int k = 0;k < i - 1;k++)
							 {
								  a2[k] = a2[k + 1];
							 }

					  }
				  }
			   }

		}
		if (a1[0] < a2[0]) //????????
		{
			a -= 200;
		}
		else
		{
			 if (a1[0] > a2[0])
			 {
				   a += 200;
			 }
			 else
			 {
			 a = a;
			 }
		}
		return a;
	}
	public static int Main()
	{
		int n = 1;
		int[] a1 = new int[2000];
		int[] a2 = new int[2000];
		for (int k = 1;n != 0;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n != 0)
			{
					for (int i = 0;i < n;i++)
					{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a1[i] = Integer.parseInt(tempVar2);
						}
					}
					for (int i = 0;i < n;i++)
					{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a2[i] = Integer.parseInt(tempVar3);
						}
					}

					for (int i = 0;i < n;i++) //??????
					{
							 for (int j = 0;j < n - i - 1;j++)
							 {
								 if (a1[j] < a1[j + 1])
								 {
										 int temp;
											 temp = a1[j];
										  a1[j] = a1[j + 1];
										 a1[j + 1] = temp;
								 }
							 }
					}
					for (int i = 0;i < n;i++) //??????
					{
							 for (int j = 0;j < n - i - 1;j++)
							 {
								 if (a2[j] < a2[j + 1])
								 {
										 int temp;
											 temp = a2[j];
										  a2[j] = a2[j + 1];
										 a2[j + 1] = temp;
								 }
							 }
					}
					if (k == 1)
					{
					System.out.printf("%d",duma(n, a1, a2));
					}
					else
					{
					System.out.printf("\n%d",duma(n, a1, a2));
					}
			}
		}
		return 0;
	}

}

