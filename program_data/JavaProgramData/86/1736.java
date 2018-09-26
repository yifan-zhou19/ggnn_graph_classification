package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 0;i < n;i++)
	   {
		  int k;
		  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (k == 0)
		  {
			  System.out.print(60);
			  System.out.print("\n");
		  }
		  else
		  {
			 int[] a = new int[k];
			 for (int j = 0;j < k;j++)
			 {
			   a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			 for (int j = 0;j < k;j++)
			 {
				 if (a[j] + 3 * (j + 1) <= 60)
				 {
					if (j == k - 1)
					{
						System.out.print(60 - 3 * k);
						System.out.print("\n");
					}
					else
					{
					continue;
					}
				 }
				 else
				 {
					if (a[j] + 3 * (j + 1) <= 63)
					{
					   System.out.print(a[j]);
					   System.out.print("\n");
					   break;
					}
				 else
				 {
					 System.out.print(60 - 3 * j);
					 System.out.print("\n");
					 break;
				 }
				 }
			 }
		  }
	   }


	 return 0;
	}

}

