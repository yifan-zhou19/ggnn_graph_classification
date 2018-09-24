package <missing>;

public class GlobalMembers
{
	public static int Max(int[] b, int n)
	{
		int max = b[0];
		int i;
		for (i = 0;i < n;i++)
		{
				if (b[i] > max)
				{
				max = b[i];
				}
		}
		return max;
	}
	public static int Main()
	{
		int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
		int[] a = new int[30];
		int[] b = new int[30];
		int d = 0;
	   for (int i = 0;i < k;i++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	   }
		b[k - 1] = 1;
		int i;
		int j;
		for (i = k - 2;i >= 0;i--)
		{
				int[] c = new int[30];
				d = 0;
				for (j = i + 1;j < k;j++)
				{
				if (a[i] >= a[j])
				{
				c[d] = b[j];
				d++;
				}
				}
		 b[i] = Max(c, d) + 1;
		}
		 int max = Max(b, k);
		 System.out.printf("%d\n",max);
	}
}

