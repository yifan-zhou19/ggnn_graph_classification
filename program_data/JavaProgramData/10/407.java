package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[30];
		int[] b = new int[30];
		int sum;
		int i;
		int j;
		int m;
		int p = 0;
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
		for (i = k - 1;i > 0;i--)
		{
			if (a[i - 1] >= a[i])
			{
				b[i - 1] = b[i] + 1;
			}
			else
			{
				break;
			}
		}
		for (j = i - 1;j >= 0;j--)
		{
			sum = b[k - 1];
		   for (m = k - 1;m > j;m--)
		   {
			  if (a[j] >= a[m] != 0 && b[m] >= sum)
			  {
			   sum = b[m],p++;
			  }
		   }
		   if (p == 0)
		   {
			   b[j] = 1;
		   }
		   else
		   {
			  b[j] = sum + 1;
		   }
		}
		sum = 0;
		for (i = 0;i < k;i++)
		{
			if (b[i] > sum)
			{
				sum = b[i];
			}
		}
		System.out.printf("%d",sum);
	}
}

