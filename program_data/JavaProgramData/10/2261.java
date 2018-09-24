package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int z;
		int i;
		int j;
		int t;
		int temp;
		int r;
		int[] b = new int[25];
		if (n == 1)
		{
			z = 1;
		}
		else if (n == 0)
		{
			z = 0;
		}
		else
		{
			for (i = 0,r = 0;i < n;i++)
			{
			for (j = i + 1,t = 0;j < n;j++)
			{
				if (a[j] <= a[i])
				{
					b[t] = a[j];
					t++;
				}
			}
			temp = max(b, t) + 1;
			if (temp > r)
			{
				r = temp;
			}
			}
		z = r;
		}
		return z;
	}

	public static int Main()
	{
		int k;
		int t;
		int i;
		int[] bomb = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bomb[i] = Integer.parseInt(tempVar2);
			}
		}
		t = max(bomb, k);
		System.out.printf("%d\n",t);
	}
}

