package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != k)
			{
				System.out.printf("%d",a[i]);
			break;
			}
		}
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[j] != k)
				{
					System.out.printf(" %d",a[j]);
				}
			}
	}
}

