package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		   int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   int[] a = new int[100];
		   int b = 0;
		   int i = 0;
		   int j = 0;
		   for (i = 1;i <= n;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
		   }
			for (j = 1;j <= n;j++)
			{
				for (i = 1;i <= n - j;i++)
				{
					if (a[i] < a[i + 1])
					{
						b = a[i];
						a[i] = a[i + 1];
						a[i + 1] = b;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				;
			}

			System.out.printf("%d\n",a[1]);
			System.out.printf("%d\n",a[2]);
			return 0;
	   }
}

