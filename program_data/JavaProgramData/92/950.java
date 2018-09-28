package <missing>;

public class GlobalMembers
{
	 public static int i2 = 0;
	 public static int j2 = 0;
	  public static int i1;
	  public static int j1;
	 public static int sum;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int k;
	public static int n;
	public static void tianji2()
	{
		 if (k == n)
		 {
		 return;
		 }

		  while (true)
		  {
			if (k == n)
			{
			  break;
			}
			  k++;
			 if (a[i1] > b[j1])
			 {
				  i1--;
				  j1--;
				  sum += 100;
				  continue;
			 }
		   if (a[i1] < b[j1])
		   {
				 i1--;
				 sum -= 100;
				 j2++;
				 continue;
		   }
			if (a[i1] == b[j1])
			{
			   if (a[i2] == b[j2])
			   {
				   if (a[i1] != a[i2])
				   {
					   sum -= 100;
				   }
				   i1--;
				   j2++;
			   }
			   else
			   {
				   k--;
				   tianji1();
				   return;
			   }
			}
		  }
	}
	public static void tianji1()
	{
		 if (k == n)
		 {
		 return;
		 }

		  while (true)
		  {
			  if (k == n)
			  {
			  break;
			  }
			  k++;

			 if (a[i2] > b[j2])
			 {
				  i2++;
				  j2++;
				  sum += 100;
				  continue;
			 }
			  if (a[i2] < b[j2])
			  {
				  i1--;
				  sum -= 100;
				  j2++;
				  continue;
			  }
			 if (a[i2] == b[j2])
			 {
			   if (a[i1] == b[j1])
			   {
					if (a[i1] != a[i2])
					{
						sum -= 100;
					}
					i1--;
					j2++;
			   }
			   else
			   {
				   k--;
				   tianji2();
				   return;
			   }
			 }
		  }
	}

	public static int Main()
	{
		while (true)
		{
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 if (n == 0)
				 {
				 break;
				 }

			   for (int i = 0;i < n;i++)
			   {
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
				 for (int i = 0;i < n;i++)
				 {
			   b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 }
			   for (int i = 0;i < n;i++)
			   {
			   for (int temp = a[i],j = i - 1;j >= 0;j--)
			   {

				 if (temp < a[j])
				 {
					 a[j + 1] = temp;
					 break;
				 }
				 a[j + 1] = a[j];
				 a[j] = temp;
			   }
			   }
				 for (int i = 0;i < n;i++)
				 {
			   for (int temp = b[i],j = i - 1;j >= 0;j--)
			   {
				 if (temp < b[j])
				 {
					 b[j + 1] = temp;
					 break;
				 }
				 b[j + 1] = b[j];
				 b[j] = temp;
			   }
				 }

			 sum = 0;
			   i2 = 0,j2 = 0;
			   i1 = n - 1;
			   j1 = n - 1;
			   k = 0;

			 tianji1();
			 System.out.print(2 * sum);
			 System.out.print("\n");
		}

		return 0;

	}

}

