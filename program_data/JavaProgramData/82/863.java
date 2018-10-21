package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] < 141 && a[i]>89 && b[i] < 91 && b[i]>59)
				{
				c[i] = 1;
				}
				else
				{
				c[i] = 0;
				}
		}
				for (int m = 0;m < n;m++)
				{
					d[m] = 0;
				}
			   if (c[0] == 1)
			   {
				   d[0] = 1;
			   }
			   else
			   {
			   d[0] = 0;
			   }
			   int l = 0;
			   for (int k = 1;k < n;k++)

			   {

				  if (c[k] == 1 && c[k - 1] == 1)
				  {
					  d[l]++;
				  }
				  if (c[k] == 1 && c[k - 1] == 0)
				  {
					  l++;
					  d[l]++;
				  }
				  if (c[k] == 0 && c[k - 1] == 1)
				  {
					  l++;
				  }
				  if (c[k] == 0 && c[k - 1] == 0)
				  {
					  l++;
				  }
			   }
					   for (int q = 1;q < n;q++)
					   {
						   if (d[q] > d[0])
						   {
							   d[0] = d[q];
						   }
					   }
					 System.out.print(d[0]);
					 System.out.print("\n");

	return 0;
	}


}

