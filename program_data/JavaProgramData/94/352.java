package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int j = 0;
		int i;
		int k;
		int s;
		int x = 0;
		int[] a = new int[500];
		int[] b = new int[100];
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
			s = a[i] % 2;
			switch (s)
			{
			case 0:
				break;
			case 1:
				b[j] = a[i];
				j++;
				x++;
				break;
			}
		}
		for (k = 1;k <= x;k++)
		{
			for (j = 0;j < x - k;j++)
			{
				if (b[j] > b[j + 1])
				{
					e = b[j];
					b[j] = b[j + 1];
					b[j + 1] = e;
				}
			}
		}
		for (j = 0;j < x - 1;j++)
		{
			System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[x - 1]);
		return 0;
	}
}

