package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l = 0;
		int g = 0;
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
		if (n == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			for (i = n - 1;i >= 0;i--)
			{
				if (a[n - 1] == a[i])
				{
					k++;
				}
			}
			if (k == n)
			{
				System.out.printf("%d",a[0]);
			}
			else
			{
				System.out.printf("%d ",a[0]);
				for (i = 1;i < n;i++)
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a[i] != a[j])
						{
							l++;
						}
					}
					if (l == i)
					{
						b[g] = a[i];
						g++;
					}
						l = 0;
				}
				for (i = 0;i < g - 1;i++)
				{
					System.out.printf("%d ",b[i]);
				}
				System.out.printf("%d",b[g - 1]);
			}
		}
		return 0;
	}

}

