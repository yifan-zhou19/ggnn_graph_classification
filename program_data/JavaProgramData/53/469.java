package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[310];
		int b;
		int[] c = new int[310];
		int i;
		int j;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		c[k] = a[1];
		for (i = 2;i <= n;i++)
		{
			for (j = i - 1;j >= 1;j--)
			{
				if (a[j] == a[i])
				{
					break;
				}
			}
			if (j == 0)
			{
				k++;
				c[k] = a[i];
			}
		}
		System.out.printf("%d",c[1]);
		if (k > 1)
		{
			for (i = 2;i <= k;i++)
			{
				System.out.printf(",%d",c[i]);
			}
		}
		System.out.print("\n");
	}

}

