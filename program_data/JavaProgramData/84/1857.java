package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int max;
		int cimax;
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
		max = 0;
		cimax = 0;
		for (j = 0;j < n;j++)
		{
		   if (a[j] > max)
		   {
			  max = a[j];
		   }
		}
		System.out.printf("%d\n",max);
		for (k = 0;k < n;k++)
		{
		   if (a[k] > cimax && a[k] != max)
		   {
			  cimax = a[k];
		   }
		}
		System.out.printf("%d\n",cimax);
	}
}

