package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int height = 9999;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[][] b = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b[i] = (int)malloc(9999 * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i <= n - 2;i++)
		{
			if (a[i] > a[i + 1])
			{
				k = a[i];
				a[i] = a[i + 1];
				a[i + 1] = k;
			}
		}
		height = a[n - 1];
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j <= height;j++)
			{
				if (i == n - 1)
				{
					if (j >= a[i])
					{
					b[i][j] = 1;
					}
					else
					{
					b[i][j] = 0;
					}
				}
				else
				{
				if (j >= a[i])
				{
					if (1 + b[i + 1][a[i]] > b[i + 1][j])
					{
						b[i][j] = 1 + b[i + 1][a[i]];
					}
					else
					{
					b[i][j] = b[i + 1][j];
					}
				}
				else
				{
				b[i][j] = b[i + 1][j];
				}
				}
			}
		}
		System.out.printf("%d",b[0][height] + 1);
	}
}

