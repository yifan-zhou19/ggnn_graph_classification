package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int j;
		int t;
		char c = ',';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[i] = a[i];
			}
			continue;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%d%c",b[i],c);
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d",b[n - 1]);
		return 0;
	}

}

