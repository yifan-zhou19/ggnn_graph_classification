package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[50000];
	   int[] b = new int[50000];
	   int[] c = new int[10000];
	   int i;
	   int j;
	   int s;
	   int min;
	   int max;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
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
	   }
	   min = a[0];
	   for (i = 0;i < n;i++)
	   {
		  if (a[i] < min)
		  {
			 min = a[i];
		  }
	   }
	   max = b[0];
	   for (i = 0;i < n;i++)
	   {
		  if (b[i] > max)
		  {
			 max = b[i];
		  }
	   }
	   for (i = min * 2;i <= max * 2;i++)
	   {
		  c[i] = 1;
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = min * 2;j <= max * 2;j++)
		  {
			 if (j / 2 >= a[i] != 0 && 1.0 * j / 2 <= b[i])
			 {
				c[j] = 0;
			 }
		  }
	   }
	   for (i = min * 2,s = 0;i <= max * 2;i++)
	   {
		  s += c[i];
	   }
	   if (s == 0)
	   {
		  System.out.printf("%d %d",min,max);
	   }
	   else
	   {
		  System.out.print("no");
	   }
	   return 0;
	}
}

