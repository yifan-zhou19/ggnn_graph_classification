package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int sum = 0;
		int k = 0;
		int t = 0;
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
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (j == i)
			{
				k++;
			}
		}
		if (k == 1)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
					if (a[i] == a[j])
					{
						break;
					}
				}
				if (j == i)
				{
					System.out.printf("%d\n",a[i]);
				}
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
					if (a[i] == a[j])
					{
						break;
					}
				}
				if (j == i)
				{
					System.out.printf("%d",a[i]);
					t++;
					if (t < k)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("\n");
					}
				}
			}
		}
	}
}

