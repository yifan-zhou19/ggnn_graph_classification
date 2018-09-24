package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,k = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			c = 1;
			for (j = 0;j < k;j++)
			{
				if (a[j] == b)
				{
					c *= 0;
					break;
				}
			}
			if (c != 0)
			{
				a[k++] = b;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
}

