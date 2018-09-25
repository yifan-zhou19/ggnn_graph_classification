package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		int j;
		for (i = 0 ; i < n ; i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		   for (i = 0 ; i < n ; i++)
		   {
				  for (j = i + 1 ; j < n ; j++)
				  {
						 if (a[i] > a[j])
						 {
								temp = a[i];
								a[i] = a[j];
								a[j] = temp;
						 } //??????
				  }
		   }
		   for (i = 0 ; i < n ; i++)
		   {
				  if (a[i] % 2 != 0)
				  {
					  System.out.print(a[i]);
					  break; //???????????
				  }
		   }
			  for (i = i + 1 ; i < n ; i++)
			  {
				  if (a[i] % 2 != 0)
				  {
					  System.out.print(",");
					  System.out.print(a[i]);
				  }
			  }

		  return 0;
	}


}

