package <missing>;

public class GlobalMembers
{
	public static int choose(int n,int m)
	{
		int[] a = new int[MAX];
		int i;
		int j;
		int k;
		for (i = 1;i <= n;i++)
		{
			a[i] = 1;
		}
		a[n + 1] = 0;
		i = 0;
		j = 0;
		k = 0;
		while (k < n)
		{
			i++;
			while (a[i] == 0)
			{
				i++;
				if (i > n)
				{
					i = 1;
				}
			}
			j++;
			if (j == m)
			{
				a[i] = 0;
				j = 0;
				k++;
			}
		}
		return i;
	}
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (m != 0 || n != 0)
		{
			System.out.printf("%d\n",choose(n, m));
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}

	}


}

