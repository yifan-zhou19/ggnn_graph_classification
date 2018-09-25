package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[k];
		int[] b = new int[100];
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		b[0] = 1;
		max = 1;
		for (i = 1;i < k;i++)
		{
		   b[i] = 1;
		   for (j = 0;j < i;j++)
		   {
		   if (a[j] >= a[i])
		   {
		   if (b[j] + 1 > b[i])
		   {
		   b[i] = b[j] + 1;
		   }
		   }
		   }
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

