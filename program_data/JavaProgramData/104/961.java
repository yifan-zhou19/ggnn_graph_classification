package <missing>;

public class GlobalMembers
{
	public static void tree(int p, int k, int[] c)
	{
		c[k] = p;
		if (c[k] == 1)
		{
			return;
		}
		else
		{
			tree(c[k] / 2, k + 1, c);
		}
	}

	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[12];
		int[] b = new int[12];
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
		tree(x, 0, a);
		tree(y, 0, b);
		for (i = j = 0;;)
		{
			if (a[i] > b[j])
			{
				i++;
				continue;
			}
			if (b[j] > a[i])
			{
				j++;
				continue;
			}
			if (a[i] == b[j])
			{
				break;
			}
		}
		System.out.printf("%d\n",a[i]);
	}

}

