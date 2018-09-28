package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
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
				a[i] = tempVar2;
			}
		}
		b[0] = a[0];
		j = 1;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < j;k++)
			{
				if (a[i] == b[k])
				{
					break;
				}
			}
			if (k == j)
			{
				b[j] = a[i];
				j++;
			}
		}

		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j - 1]);
	}
}

