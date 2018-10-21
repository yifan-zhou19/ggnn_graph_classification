package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
		   for (j = i + 1;j <= n;j++)
		   {
			 if (a[i] == a[j])
			 {
				 a[j] = -10000;
			 }

		   }


		}
	for (i = 1;i <= n;i++)
	{
		   if (a[i] != -10000)
		   {
			  System.out.printf("%d",a[i]);
			  m = 0;
			  k = i;
		   }
		   if (m == 0)
		   {
			   break;
		   }
	}

	for (i = k + 1;i <= n;i++)
	{
		   if (a[i] != -10000)
		   {
			  System.out.printf(",%d",a[i]);
		   }
	}

	}


}

