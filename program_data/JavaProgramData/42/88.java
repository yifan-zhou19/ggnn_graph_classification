package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int[] a = new int[100000];
		int b;
		int i;
		int j;
		int k;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}

		for (j = 0;j <= c - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (j = 0;j <= c - 1;j++)
		{
			if (a[j] == b)
			{
			for (k = j + 1;k < c;k++)
			{
			if (a[k] != b)
			{
				a[j] = a[k];
				a[k] = b;
				break;
			}
			}
			}
			if (a[j] == b)
			{
				break;
			}
		}

		for (i = 0;i < j;i++)
		{
			if (i == j - 1)
			{
		System.out.printf("%d",a[i]);
			}
		else
		{
			System.out.printf("%d ",a[i]);
		}
		}

	}

}

