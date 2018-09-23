package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[18];
		int m;
		int n;
		int i;
		int j;
		int r = 0;
		int[] b = new int[100];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t != -1)
		{
			m = 1;
			r++;
			n = 0;
			a[0] = t;
			for (i = 1;i < 18;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] != 0)
				{
					m = m + 1;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < m;i++)
			{
				for (j = m - 1;j > i;j--)
				{
				if (a[j] == 2 * a[i] || a[i] == 2 * a[j])
				{
					n++;
				}
				}
			}
			b[r] = n;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < r + 1;i++)
		{
				System.out.printf("%d\n",b[i]);
		}
	}
}

