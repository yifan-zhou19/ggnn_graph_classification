package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int Main()
	{
	  a[0] = 1;
	  int k = 1;
	  int i;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n-- != 0)
	  {
		for (i = 0;i < k;i++)
		{
			a[i] *= 2;
		}
		for (i = 0;i < k;i++)
		{
		   if (a[i] >= 10)
		   {
			   a[i + 1] += a[i] / 10;
			   a[i] %= 10;
			   if (i == k - 1)
			   {
				 k++;
			   }
		   }
		}
	  }
	  for (i = k - 1;i >= 0;i--)
	  {
		 System.out.printf("%d",a[i]);
	  }
	 return 0;
	}

}

