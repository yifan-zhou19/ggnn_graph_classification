package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int j = 0;
		int t = 0;
		int flag;
		int r;
		int b;
		int[] c = new int[10000];
		int[] a = new int[10000];
		int[] d = new int[10000];
		int s = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			flag = 0;
			k = 2;
			while (k < Math.sqrt(n))
			{
				r = i % k;
				if (r == 0)
				{
					flag = 1;
					break;
				}
				else
				{
					k++;
				}
			}
			if (flag == 0)
			{
				a[j] = i;
				j++;
			}
		}
		l = j;
		for (j = 0;j < l;j++)
		{
			b = a[j];
			i = 0;
			flag = 0;
			while (b > 0)
			{
				c[i] = b % 10;
				b = (b - c[i]) / 10;
				i++;
			}
			k = i;
			for (i = 0;i < k / 2;i++)
			{
				if (c[i] != c[k - i - 1])
				{
					flag = 1;
					break;
				}
			}
				if (flag == 0)
				{
					d[s] = a[j];
					s++;
					t++;
				}
		}
		if (t > 0)
		{
			for (i = 0;i < s - 1;i++)
			{
			System.out.printf("%d,",d[i]);
			}
			System.out.printf("%d",d[s - 1]);
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

