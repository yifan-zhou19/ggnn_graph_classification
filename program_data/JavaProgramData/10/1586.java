package <missing>;

public class GlobalMembers
{
	public static void Qsort(int[] a, int low, int up) //????????
	{
		int i;
		int j;
		int k;
		int x;
		if (low >= up)
		{
			return;
		}
		else
		{
			k = a[low];
			j = low;
			for (i = low;i <= up;i++)
			{
				if (a[i] > k)
				{
					j++;
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		x = k;
		a[low] = a[j];
		a[j] = x;
		Qsort(a, low, j - 1);
		Qsort(a, j + 1, up);

	}
	public static int num(int[] a, int low, int up)
	{
		if (low >= up)
		{
			return 1;
		}
		int i;
		int j;
		int[] b = new int[26];
		j = 0;
		for (i = low + 1;i <= up;i++)
		{
			 if (a[i] <= a[low])
			 {
			 b[j] = num(a, i, up);
			 j++;
			 }
		}
		Qsort(b, 0, 25);
		return b[0] + 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = num(a, i, n - 1);
		}
		Qsort(b, 0, n - 1);
		System.out.printf("%d\n",b[0]);

	}
}

