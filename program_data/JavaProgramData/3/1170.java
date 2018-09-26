package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int j;
	   int d = 0;
	   int[] a = new int[1000];
	   int s;
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
			   a[i] = Integer.parseInt(tempVar3);
		   }
		   for (j = 1;j <= i;j++)
		   {
			   s = a[i] + a[j];
			   if (s == k)
			   {
				   d++;
			   }
		   }
	   }
	   if (d != 0)
	   {
		   System.out.print("yes");
	   }
	   else if (d == 0)
	   {
		   System.out.print("no");
	   }
	   return 0;
	}

}

