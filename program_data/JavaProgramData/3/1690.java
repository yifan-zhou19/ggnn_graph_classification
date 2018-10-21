package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	   int i;
	   int j;
	   int s;
	   int m;
	   int n;
	   int k;
	   m = 0;
	   int[] x = new int[1000];
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	 for (i = 0;i < n;i++)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   x[i] = Integer.parseInt(tempVar3);
	   }
	 }
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			  s = x[i] + x[j];
			 if (s == k)
			 {
				System.out.print("yes");
			m++;
			break;
			 }
			}
	   if (m != 0)
	   {
		 break;
	   }
		}
		if (m == 0)
		{
		System.out.print("no");
		}
	   return 0;
	  }
}

