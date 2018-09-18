package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int h = 1;
		int j;
		int[] b = new int[100000];
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
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (j == i)
			{
				b[h] = a[i];
				h++;
			}
		}
		for (i = 1;i <= h - 1;i++)
		{
			if (i < h - 1)
			{
				System.out.printf("%d ",b[i]);
			}
				else if (i == h - 1)
				{
					System.out.printf("%d",b[i]);
				}
		}
	}

}

