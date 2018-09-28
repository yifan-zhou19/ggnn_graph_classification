package <missing>;

public class GlobalMembers
{
	public static int find(int[] a, int p)
	{
		int i;
		for (i = 1;i < p;i++)
		{
			if (a[i] == a[p])
			{
				return 1;
			}
		}
		return 0;
	}
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int j;
		int k;
		int count = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			b[j] = a[j];
		}
		for (j = 2;j <= n;j++)
		{
			if (find(a, j) == 1)
			{

				for (k = j - count;k <= 300;k++)
				{
					b[k] = b[k + 1];
				}
				count++;
			}
		}
		System.out.printf("%d",b[1]);
		for (j = 2;j <= n - count;j++)
		{
			System.out.printf(",%d",b[j]);
		}
	}
}

