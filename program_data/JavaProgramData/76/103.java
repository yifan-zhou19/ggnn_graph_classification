package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int m = 0;
		int p = 0;
		int k = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] a = new int[50000];
		int[] b = new int[50000];
		for (i = 0;i < 50000;i++)
		{
			  a[i] = b[i] = 0;
		}
		for (i = 1;i < n + 1;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		}
		for (i = n;i >= 1;i--)
		{
		  for (j = 1;j < i + 1;j++)
		  {
				if (a[i] < a[j])
				{
					m = a[j];
					p = b[j];
					a[j] = a[i];
					b[j] = b[i];
					a[i] = m;
					b[i] = p;
				}
		  }
		}
		k = b[1];
		for (i = 1;i < n + 1;i++)
		{
		   q = 0;
		   for (j = i;j >= 1;j--)
		   {
			  if (a[i + 1] > b[j])
			  {
				  continue;
			  }
			  else
			  {
				  q = 1;
			  }
		   }
		   if (q == 0)
		   {
				   System.out.print("no");
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   m = Integer.parseInt(tempVar4);
				   }
				   return 0;
		   }
		 if (b[i] > k)
		 {
		 k = b[i];
		 }
		}
		System.out.printf("%d %d",a[1],k);


		//scanf("%d",&n);
		return 0;
	}

}

