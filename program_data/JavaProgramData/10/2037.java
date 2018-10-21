public class missle
{
	public int id;
	public int h;
}

package <missing>;

public class GlobalMembers
{
	public static missle[] p;
	public static missle tmp = new missle();
	public static int max = 0;

	public static int maxn(int i, int n)
	{
		int max2 = 1;
		int re = 1;
		int j;
		if (i == n - 1)
		{
			max2 = 1;
		}
		else
		{
			for (j = i + 1 ; j < n ; j++)
			{
				re = 1;
				if (pass(i, j) == 1)
				{
					re += maxn(j, n);
					if (re > max2)
					{
						max2 = re;
					}
				}
			}
		}
		if (max2 > max)
		{
			max = max2;
			//printf("%d\n",i);
		}
		return max2;
	}
	public static int pass(int pre, int aft)
	{
		if (p[pre].h >= p[aft].h)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultmissleInstances(k);
		int i = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].h = Integer.parseInt(tempVar2);
			}
			p[i].id = i;
			i++;
		}while (i < k);
		int j;
		for (i = 0 ; i < k ; i++)
		{
			j = maxn(i, k);
		}

		System.out.printf("%d\n",max);
		p = null;

		return 0;
	}
}

