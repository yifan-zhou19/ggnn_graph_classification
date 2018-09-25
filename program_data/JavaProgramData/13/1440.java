package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int n;
	   int i;
	   int j;
	   int k;
	   k = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	   }
	   for (j = 0;j < n - 1;j++)
	   {
		  if (a[j] != 100)
		  {
		  for (i = j + 1;i < n;i++)
		  {
			  if (a[i] == a[j])
			  {
				a[i] = 100;
			  }
		  }
		  }
	   }
	   System.out.printf("%d",a[0]);
	   for (i = 1;i < n;i++)
	   {
		  if (a[i] != 100)
		  {
			System.out.printf(" %d",a[i]);
		  }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   return 0;
	   }



}

