package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int l;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[n];
		int[] d = new int[n];
		for (i = 0;;i++)
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
					 if (a[i] == 0 && b[i] == 0)
					 {
					 break;
					 }

		}
		   for (i = 0;i < n;i++)
		   {
			 c[i] = 0;
			 d[i] = 0;

		   }
		  k = 0;
		   for (i = 0;;i++)
		   {
		  if (a[i] == 0 && b[i] == 0)
		  {
					 break;
		  }
					 else
					 {
							 m = a[i];
			c[m] = 1;
			l = b[i];
			d[l]++;
					 }


		   }
			  for (i = 0;i < n;i++)
			  {
			   if (c[i] == 0 && d[i] == n - 1)
			   {
			   System.out.printf("%d",i);
			   }
			   k = 1;
			  }
		  if (k == 0)
		  {
		   System.out.print("NOT FOUND");
		  }




		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();


	}




}

