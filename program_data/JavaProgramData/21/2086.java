package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int max;
		int min;
		int pian;
		int[] a = new int[300];
		int all;
		int[] b = new int[20];
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
	 }
	 min = a[0];
	 max = a[0];
	 all = a[0];
	 for (i = 1;i < n;i++)
	 {
		   all = all + a[i];
		if (a[i] > max)
		{
			max = a[i];
		}
		if (a[i] < min)
		{
			min = a[i];
		}
	 }
	 min = min * n;
	 max = max * n;
	 pian = (max - all) > (all - min)?(max - all):(all - min);
	 j = 0;
	 for (i = 0;i < n;i++)
	 {
		if (((a[i] * n - all) == pian) || ((a[i] * n - all) == (-pian)))
		{
				b[j] = a[i];
			 j++;
		}
	 }

	 for (i = 0;i < j;i++)
	 {
		  for (k = i + 1;k < j;k++)
		  {
			   if (b[k] < b[i])
			   {
					   t = b[i];
					b[i] = b[k];
					b[k] = t;
			   }
		  }
	 }
	 System.out.printf("%d",b[0]);
	 for (i = 1;i < j;i++)
	 {
		   System.out.printf(",%d",b[i]);
	 }
	}


}

