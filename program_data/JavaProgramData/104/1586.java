package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] a = {m, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = {n, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;a[i] != 1;i++)
		{
			a[i + 1] = a[i] / 2;
		}
		for (j = 0;b[j] != 1;j++)
		{
			b[j + 1] = b[j] / 2;
		}
		for (k = 0;i - k >= 0 && j - k >= 0;k++)
		{
			if (a[i - k] != b[j - k])
			{
				break;
			}
		}
		System.out.printf("%d",a[i - k + 1]);
	}
}

