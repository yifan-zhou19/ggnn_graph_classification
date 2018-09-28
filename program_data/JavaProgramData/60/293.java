package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		j = 3;

		while (j <= n - 2)
		{
					 k = 0;
					 for (h = 2;h <= j - 1;h++)
					 {
						   if (j % h == 0 || (j + 2) % h == 0)
						   {
						   break;
						   }
						   if ((j + 2) % j == 0 || (j + 2) % (j + 1) == 0)
						   {
						   break;
						   }

						   k++;
					 }
									  if (k == j - 2)
									  {
										  System.out.printf("%d %d\n",j,j + 2);
									  i++;
									  }
									  j++;
		}
		if (i == 0)
		{
		System.out.print("empty");
		}


		 System.in.read();
		 System.in.read();
	}

}

