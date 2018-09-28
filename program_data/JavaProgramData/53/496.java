package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		b[0] = a[0];
		j = 1;
		for (i = 1;i < n;i = i + 1)
		{
			t = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (k = i - 1;k >= 0;k = k - 1)
			{
				if (a[i] == a[k])
				{
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		k = j;
		for (j = 0;j < k - 1;j = j + 1)
		{
			System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[k - 1]);
	}
}

