package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int I;
		int n;
		int j;
		int k = 0;

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

		for (I = 1;I < n;I++)
		{
			  for (i = 0;i < I;i++)
			  {
					if (a[I] == a[i])
					{
					a[I] = 0;
				 k++;
					break;
					}
			  }
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
			   for (j = i + 1;j < n;j++)
			   {
					 if (a[j] != 0)
					 {
						 a[i] = a[j];
						 a[j] = 0;
						 break;
					 }
			   }
			}
		}

		for (i = 0;i < n - k - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
			System.out.printf("%d",a[n - k - 1]);

	   return 0;
	}



}

