package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int x;
		int y;
		int k = 0;
		int l = 0;
		int z = 0;
		int[] t = new int[MAX];
		int sum = 0;
		int e = 0;
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
			if (b[i] > k)
			{
				k = b[i];
			}
			l = a[0];
			if (a[i] < l)
			{
				l = a[i];
			}
			for (j = 2 * a[i];j < 2 * b[i] + 1;j++)
			{
				t[j] = 1;
			}
		}
		for (i = 0;i < MAX;i++)
		{
			if (t[i] == 1)
			{
				sum++;
				if (t[i + 1] == 0)
				{
					if (sum > e)
					{
						e = sum;
						x = (i - e+1) / 2;
						y = i / 2;
						sum = 0;
					}
				}
			}
		}
		for (i = 2 * l;i < 2 * k + 1;i++)
		{
			if (t[i] == 0)
			{
				System.out.print("no");
				z = 1;
				break;
			}
		}
		if (z == 0)
		{
			System.out.printf("%d %d\n",x,y);
		}

		return 0;
	}
}

