package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int[] a = new int[300];
	   int[] b = new int[300];

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
	   b[0] = a[0];
	   k = 0;
	   for (i = 0;i < n;i++)
	   {

		   for (j = i + 1;j < n;j++)
		   {

			   if (a[i] == a[j])
			   {
				   a[j] = 0;
			   }

		   }
		   if (a[i] != 0)
		   {
			   b[k] = a[i];
			   k += 1;
		   }
	   }


	   for (i = 0;i < k - 1;i++)
	   {
		 System.out.printf("%d,",b[i]);
	   }
	   System.out.printf("%d\n",b[k - 1]);

	  return 0;

	}
}

