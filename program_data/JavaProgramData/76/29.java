package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int[] d = new int[10000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			int e = 1;
			for (j = 0;j < n;j++)
			{
				if ((a[i] > a[j] && b[i] < b[j] || a[i] >= a[j] != 0 && b[i] < b[j] || a[i]> a[j] && b[i] <= b[j]) && i != j)
				{
					e = 0;
					break;
				}
			}
			if (e != 0)
			{
				c[k] = a[i];
				d[k] = b[i];
				k++;
			}

		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{

				if (c[j] > c[j + 1] || (c[j] == c[j + 1] && d[j] > d[j + 1]))
				{
					int f;
					int g;
					f = c[j];
					c[j] = c[j + 1];
					c[j + 1] = f;
					g = d[j];
					d[j] = d[j + 1];
					d[j + 1] = g;
				}
			}
		}
		int isbreak = 0;
		for (i = 0;i < k;i++)
		{
			if (d[i] < c[i + 1])
			{
				isbreak = 1;
				System.out.print("no");
				break;

			}
		}
		if (isbreak == 0)
		{
			System.out.printf("%d %d",c[0],d[k - 1]);
		}
		return 0;
	}

}

