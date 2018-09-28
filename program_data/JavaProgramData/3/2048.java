package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int n;
	   int i;
	   int m;
	   int k;
	   int b;
	   int g;
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
	   int[] a = new int[n];
	   for (i = 0;i < n;i++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	   }
		  for (i = 1;i < n;i++)
		  {
		  for (m = 0;m < i;m++)
		  {
		  if (a[i] + a[m] == k)
		  {
			   b = k;
			   System.out.print("yes");
			   return 0;
		  }
		  }
		   if (i == n - 1 && b != k)
		   {
			 System.out.print("no");
		   }
		  }
		   return 0;
	   }


}

