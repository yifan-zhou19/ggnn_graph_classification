package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i = 0;
		int j;
		int[] b = new int[300];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		b[0] = a[0];
		i = 1;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				if (j == i - 1 && a[i] != a[j])
				{
					b[++m] = a[i];
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < m + 1;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		return 0;
	}
}

