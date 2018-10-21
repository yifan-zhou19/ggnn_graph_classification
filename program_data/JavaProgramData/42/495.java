package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200000];
		int b = 0;
		int n;
		int i;
		int j;
		int k;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				b++;
				for (j = i + 1;j < n + 1;j++)
				{
					a[j - 1] = a[j];
				}
				i--;
			}
		}
		for (i = 0;i < n - b - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - b - 1]);
		return 0;
	}
}

