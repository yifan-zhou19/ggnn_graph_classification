package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int k;
		int m;
		int i = 0;
		int j = 1;
		int r;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		do
		{
			if (t == 0)
			{
				i = 0;
				t = 1;
			}
			a[0] = n * j + k;
			a[i + 1] = n * a[i] / (n - 1) + k;
			r = (a[i] * n) % (n - 1);
			if (r != 0)
			{
				j++;
				t = 0;
			}
			i++;
		}while (i < n);
		m = a[n - 1];
		System.out.printf("%d",m);
	}
}

