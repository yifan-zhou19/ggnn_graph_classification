package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
		int i;
		int j;
		int k = 0;
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				{
				if (a[i] == a[j])
				{
					a[i] = 0;
				}
				else
				{
					a[i] = a[i];
				}
			}
			}
			if (a[i] != 0)
			{
				b[k] = a[i];
				k = k + 1;
			}
		}

			for (i = 0;i < k - 1;i++)
			{
			System.out.printf("%d ",b[i]);
			}
			System.out.printf("%d",b[k - 1]);
	}
}

