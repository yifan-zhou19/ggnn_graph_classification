package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int q;
	   int w;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   int[] c = new int[n];
	   int[] d = new int[n];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   c[i] = Integer.parseInt(tempVar4);
		   }

	   }
		 for (i = 0;i < n;i++)
		 {
		   d[i] = b[i] + c[i];

		 }
		for (i = 0;i < 3;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
		   if (d[i] < d[j])
		   {
				 q = d[i];
			 d[i] = d[j];
			 d[j] = q;
			 w = a[i];
			 a[i] = a[j];
			a[j] = w;
		   }




		   }

		}
						   for (i = 0;i < 3;i++)
						   {
		   System.out.printf("%d %d\n",a[i],d[i]);

						   }



		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();


	}

}

