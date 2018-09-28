package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] input = new int[500];
		int[] deal = new int[500];
		int k = 0;
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input[i] = Integer.parseInt(tempVar2);
			}
			   if (input[i] % 2 != 0)
			   {
					 deal[k] = input[i];
					 k = k + 1;
			   }
		}
		 int j;
		 int r;
		 for (j = k - 1;j > 0;j--)
		 {
				  for (r = 0;r < j;r++)
				  {
						 if (deal[r] > deal[r + 1])
						 {
										 int t;
										  t = deal[r + 1];
										 deal[r + 1] = deal[r];
										   deal[r] = t;
						 }
				  }
		 }
	for (int l = 0;l < k - 1;l++)
	{
		System.out.printf("%d,",deal[l]);
	}
	System.out.printf("%d",deal[k - 1]);
	return 0;
	}



}

