package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int i;
		int j;
		int k = 0;
		int temp;
		int m = 0;
		int[] a = new int[2000];
		int[] b = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		 for (m = 0;m < n;m++)
		 {
		  if (a[m] % 2 == 0)
		  {
		 continue;
		  }
	  else
	  {
	  b[k] = a[m];
	  k++;
	  }
		 }
	   for (j = k - 1;j >= 1;j--)
	   {
						for (c = 0;c < j;c++)
						{
						if (b[c] > b[c + 1])
						{
						   temp = b[c + 1];
					   b[c + 1] = b[c];
						b[c] = temp;
						}
						}
	   }
				   System.out.printf("%d",b[0]);
								  for (i = 1;i < k;i++)
								  {
										System.out.printf(",%d",b[i]);
								  }
					return 0;
	}
}

