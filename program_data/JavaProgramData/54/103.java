package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = 0;
		}
		for (i = 1; ;i++)
		{
			a[1] = i * n + k;
			for (j = 1;j <= n;j++)
			{
				if (a[j] % (n - 1) == 0)
				{
					a[j + 1] = a[j] / (n - 1) * n + k;
				}
				else
				{
					break;
				}
			}
			if (a[n] != 0)
			{
				System.out.printf("%d",a[n]);
				break;
			}
		}
	}


}

