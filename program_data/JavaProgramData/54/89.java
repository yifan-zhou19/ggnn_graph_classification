package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int k;
		int j;
		int i;
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
		for (j = 1;i != n + 1;j++)
		{
			a[0] = j;
			for (i = 1;i <= n;i++)
			{
				if (a[i - 1] % (n - 1) == 0)
				{
					a[i] = a[i - 1] * n / (n - 1) + k;
				}
			else
			{
				break;
			}
			}
		}
		System.out.printf("%d",a[n]);
	}
}

