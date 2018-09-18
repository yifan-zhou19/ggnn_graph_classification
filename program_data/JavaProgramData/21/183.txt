package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int temp;
		int count1 = 0;
		int count2 = 0;
		double aver = 0;
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
				aver += a[i];
		}
		 aver = aver / n;
		 for (i = n - 1;i > 0;i--)
		 {
			 for (j = 0;j < i;j++)
			 {
				 if (a[j] > a[j + 1])
				 {
				   temp = a[j + 1];
				   a[j + 1] = a[j];
					  a[j] = temp;
				 }
			 }
		 }
			 for (i = 0;i < n;i++)
			 {
				 if (a[i] == a[0])
				 {
					count1++;
				 }
				 if (a[i] == a[n - 1])
				 {
					 count2++;
				 }
			 }
			 if ((aver - a[0]) > (a[n - 1] - aver))
			 {
				 for (i = 0;i < count1 - 1;i++)
				 {
					 System.out.printf("%d,",a[i]);

				 }
					 System.out.printf("%d",a[count1 - 1]);
			 }
			   if ((aver - a[0]) < (a[n - 1] - aver))
			   {
				 for (i = n - count2;i < n - 1;i++)
				 {
					 System.out.printf("%d,",a[i]);
				 }
					 System.out.printf("%d",a[n - 1]);
			   }
			   if ((aver - a[0]) == (a[n - 1] - aver))
			   {
				  for (i = 0;i < count1;i++)
				  {
					 System.out.printf("%d,",a[i]);
				  }
				   for (i = n - count2;i < n - 1;i++)
				   {
					 System.out.printf("%d,",a[i]);
				   }
					 System.out.printf("%d",a[n - 1]);
			   }
			   return 0;
	}
}

