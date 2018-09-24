package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int p = 0;
		int q = 1;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
					if (a[i] != a[j])
					{
						p++;
					}
				}
				if (p == i)
				{
					b[q] = a[i];
					q++;
				}
				p = 0;
			}
			System.out.printf("%d",b[0]);

			for (i = 1;i < q;i++)
			{
				System.out.printf(",%d",b[i]);
			}
	}
}

