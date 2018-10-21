package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int sum;
	 int temp;
	 int k = 0;
	 int h;
	 int t = 0;
	 int pan = 0;
	 int[] a = new int[MN];
	 int[] b = new int[MN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			 for (i = m;i <= n;i++)
			 {
		   sum = 0;
			  temp = i;
		   while (temp != 0)
		   {
		   sum = sum * 10 + temp % 10;
		   temp /= 10;
		   }
	   if (i == sum)
	   {
		a[k] = i;
		k++;
		continue;
	   }
			 }
	   for (k = 0;k < MN;k++)
	   {
		for (h = 2;h < a[k];h++)
		{
		   if ((a[k] % h) == 0)
		   {
			pan = 1;
		   }
		}
		if (pan == 0)
		{
		  b[t] = a[k];
		  t++;
		  pan = 0;
		  continue;
		}
		else
		{
			pan = 0;
		}
	   }
	   if (b[0] == 0)
	   {
		   System.out.print("no");
	   }
	   else
	   {
	   for (t = 0;t < (MN - 1);t++)
	   {
				 if (b[t + 1] != 0)
				 {
					 System.out.printf("%d",b[t]);
					 System.out.print(",");
				 }
				 else if (b[t] != 0 && b[t + 1] == 0)
				 {
				 System.out.printf("%d",b[t]);
				 }
	   }
	   }
			 System.out.print("\n");
	}
}

