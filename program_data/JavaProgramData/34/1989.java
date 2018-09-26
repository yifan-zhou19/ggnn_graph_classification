package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int[] a = new int[10000];
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   i = Integer.parseInt(tempVar);
	   }

	   if (i == 1)
	   {
		   System.out.print("End\n");
	   }
	   else
	   {
			for (n = 2;;n++)
			{
					a[1] = i;
					   if (a[n - 1] % 2 == 1)
					   {
						   a[n] = a[n - 1] * 3 + 1;
						   System.out.printf("%d*3+1=%d\n",a[n - 1],a[n]);
					   }
					   else if (a[n - 1] % 2 == 0)
					   {
						   a[n] = a[n - 1] / 2;
						   System.out.printf("%d/2=%d\n",a[n - 1],a[n]);
					   }
					 if (a[n] == 1)
					 {
						 System.out.print("End\n");
						 break;
					 }
			}
	   }


	}
}

