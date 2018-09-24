package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int k;

		/* ???? */
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		/* ?????? */
		for (i = 1, k = 1; i < n; i++)
		{
			/* ?????? */
			for (j = 0; j < k; j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			/* ?????????? */
			if (j == k)
			{
				a[k] = a[i];
				k++;
			}
		}

		/* 0..k-1????????????? */
		for (i = 0; i < k; i++)
		{
			if (i == 0)
			{
				System.out.printf("%d", a[i]);
			}
			else
			{
				System.out.printf(",%d", a[i]);
			}
		}
		return 0;
	}
}

