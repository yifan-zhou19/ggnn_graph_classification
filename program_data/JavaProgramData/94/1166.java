package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int l;
		int t;
		int tem;
		int[] a = new int[500];
		int[] b = new int[500];
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
			scanf(" ");
		}
		for (j = 0,i = 0;i < n;i++)
		{
			l = a[i] % 2;
			if (l != 0 && a[i] != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			for (t = 0;t < j - k;t++)
			{
				if (b[t] > b[t + 1])
				{
					tem = b[t];
					b[t] = b[t + 1];
					b[t + 1] = tem;
				}
			}
		}
		for (i = 1;i <= j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i <= j - 1)
			{
			System.out.print(",");
			}
		}
	}
}

