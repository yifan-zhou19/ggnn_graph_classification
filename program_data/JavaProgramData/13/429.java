package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int k = 0;
		int b = 0;
		int[] a = new int[20000];
		int[] c = new int[20000];
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


	   for (i = 0;i < n;i++)
	   {
		   if (a[i] == 0)
		   {
			   continue;
		   }
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = 0;
				}
			}
	   }
		for (i = 0;i < n;i++)
		{
			   if (a[i] != 0)
			   {
				   c[k] = a[i];
				   k++;
			   }
			   else
			   {
				b = b + 1;
			   }
		}
		 for (k = 0;k < n - b - 1;k++)
		 {
			 System.out.printf("%d ",c[k]);
		 }
		 System.out.printf("%d",c[n - b - 1]);

	}






}

