package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10000];
		int[] b = new int[10000];
		int x = 0;
		for (int i = 0;;i++)
		{
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
			 break;
			}
		   x++;
		}

		int sum2 = 0;
		int sum1 = 0;
		for (int i = 0;i < n;i++)
		{
			sum1 = 0;
			sum2 = 0;
		  for (int j = 0;j < x;j++)
		  {
			 sum1 += (a[j] == i);
		  }
			 if (sum1 == 0)
			 {
				for (int k = 0;k < x;k++)
				{
				  if (b[k] == i)
				  {
					 sum2 += a[k];
				  }
				}
				if (sum2 == (n * (n - 1) / 2 - i))
				{
					System.out.print(i);
					r = 1;
				}
			 }
			 else
			 {
				 continue;
			 }

		}

	 if (r == 0)
	 {
		 System.out.print("NOT FOUND");
	 }


	 return 0;
	}


}

