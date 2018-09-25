package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int max;
	  max = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  int[] c = new int[n];
	  for (i = 0;i <= n - 1;i++)
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
		 if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90)
		 {
		   if (i == 0)
		   {
			   c[i] = 1;
		   }
		   else
		   {
			   c[i] = c[i - 1] + 1;
		   }
		 }

		 else
		 {
			 c[i] = 0;
		 }
		 if (c[i] > max)
		 {
		   max = c[i];
		 }
	  }
	  System.out.printf("%d",max);
	}
}

