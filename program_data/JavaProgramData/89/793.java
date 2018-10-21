package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int l = 0;
		int[] i = new int[100000];
		int[] j = new int[100000];
		int[] a = new int[10000];
		int b = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (k = 0;k <= 100000;k++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   i[k] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   j[k] = Integer.parseInt(tempVar3);
	   }
	   if ((i[k] == 0) && (j[k] == 0))
	   {
		{
			break;
	}
	   }
	 }

	for (int m = 0;m <= n - 1;m++)
	{
	  for (int w = 0;w <= k - 1;w++)
	  {
		if (j[w] == m)
		{
			b++;
		}
		if (i[w] == m)
		{
			b = 0;
			{
				break;
			}
		}
	  }
	   if (b == n - 1)
	   {
		   b = 0;
		   l++;
		   System.out.printf("%d\n",m);
	   }
	}

	 if (l == 0)
	 {
		 System.out.print("NOT FOUND");
	 }
	 int v;
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 v = Integer.parseInt(tempVar4);
	 }
	 return 0;


	}

}

