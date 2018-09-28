package <missing>;

public class GlobalMembers
{
	//????
	//1000062701
	//???

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20]; //????
		int m;
		int i;
		int j;
		int k;
		int sum = 0;
		for (i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0) //?????60
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
			   for (j = 0; j < m; j++)
			   {
				   a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			  for (k = m - 1; k >= 0; k--)
			  {
				  if ((a[k] + 3 * k) <= 60)
				  {
					  if ((a[k] + 3 * (k + 1)) > 60)
					  {
						  sum = a[k];
						  break; //??????????
					  }
					  else
					  {
						 sum = 60 - 3 * (k + 1);
						 break;
					  }
				  }
			  }

			System.out.print(sum);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

