package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int i;
	  int j;
	  int[] a = new int[25];
	  int h;
	  int[] b = new int[25];
	  int max = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < k;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  b[k - 1] = 1;
	  for (i = k - 2;i >= 0;i--)
	  {
		for (j = i + 1;j <= k - 1;j++)
		{
		   if (a[j] <= a[i])
		   {
			   if (b[j] + 1 > max)
			   {
				   max = b[j] + 1;
			   }
		   }
		}
		if (max == 0)
		{
			max = 1;
		}
		b[i] = max;
		max = 0;
	  }
	  for (i = 0;i <= k - 1;i++)
	  {
		 if (b[i] > max)
		 {
			 max = b[i];
		 }
	  }
	  System.out.printf("%d",max);
	  System.in.read();
	  System.in.read();
	}

}

