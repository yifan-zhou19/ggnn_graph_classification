package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m = 0;
		int h = 0;
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] a = new int[20];
		int[] b = new int[20];
		int n;
		for (i = 2;i < 20;i++)
		{
			f[i] = f[i - 2] + f[i - 1];
		}
		for (i = 0;i < 20;i++)
		{
			a[i] = f[i];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < n;k++)
		{
			m = b[k];
			h = a[m - 1];
			System.out.printf("%d\n",h);
		}
		return 0;
	}




}

