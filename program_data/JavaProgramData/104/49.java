package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = {3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i = 0;
		int j = 0;
		int t;
		int n = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x > 0)
		{
			a[i + 1] = x % 2;
			x = (x - x % 2) / 2;
			i++;
		}
		while (y > 0)
		{
			b[j + 1] = y % 2;
			y = (y - y % 2) / 2;
			j++;
		}
		t = i;
		while (a[i] == b[j])
		{
			i--;
			j--;
		}
		for (k = t;k >= i + 1;k--)
		{
			n = n * 2 + a[k];
		}
		System.out.printf("%d",n);
	}
}

