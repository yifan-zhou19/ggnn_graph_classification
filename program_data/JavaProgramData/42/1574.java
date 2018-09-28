package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		int k;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		int s = 0;
		if (a[n - 1] == k)
		{
		   a[n - 1] = k + 1;
		   s = s + 1;
		}

		for (int j = 0;j < n;j++)
		{
			if (a[j] == k)
			{
			   int p = j;
			   while (p < n - 1)
			   {
					a[p] = a[p + 1];
					p++;
			   }
			   s = s + 1;
			   j = j - 1;
			}
		}

		for (int q = 0;q < n - s;q++)
		{

			if (q == 0)
			{
			   System.out.printf("%d",a[q]);
			}
			else
			{
			   System.out.printf(" %d",a[q]);
			}
		}
		return 0;
	}

}

