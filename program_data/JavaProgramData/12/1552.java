package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int x;
		int y;
		int s;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			if (x == -1)
			{
				break;
			}
			a[0] = x;
			i = 1;
			do
			{
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					y = Integer.parseInt(tempVar2);
				}
				a[i] = y;
				i = i + 1;
			} while (y != 0);
			scanf("\n");
			n = i - 2;
			i = 0;
			while (i <= n)
			{
				j = 0;
				while (j <= n - 1)
				{
					if (a[j] > a[j + 1])
					{
						s = a[j + 1];
						a[j + 1] = a[j];
						a[j] = s;
					}
						j = j + 1;
				}
				i = i + 1;
			}
			i = 0;
			m = 0;
			while (i <= n - 1)
			{
				j = n - i;
				k = 0;
				while (k <= j - 1)
				{
					if (a[j] == 2 * a[k])
					{
						m = m + 1;
					}
					k = k + 1;
				}
				i = i + 1;
			}
			System.out.printf("%d\n",m);
		} while (x != -1);
	}
}

