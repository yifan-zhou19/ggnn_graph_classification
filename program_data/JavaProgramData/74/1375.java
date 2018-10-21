package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[10000];
		int[] c = new int[10000];
		int i;
		int j;
		int k = 1;
		int flag = 0;
		int l = 1;
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
				if (j == i)
				{
					b[k] = i;
					k++;
					flag++;
				}
		}
		k--;
		for (i = 1;i <= k;i++)
		{
			t = b[i];
			a = 0;
			while (t != 0)
			{
				a = 10 * a + t % 10;
				t = t / 10;
			}
			if (a == b[i])
			{
				c[l] = b[i];
				l++;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		else
		{
			if (l == 1)
			{
				System.out.print("no");
			}
		else
		{
			for (i = 1;i < l - 1;i++)
			{
			System.out.printf("%ld,",c[i]);
			}
		System.out.printf("%ld",c[l - 1]);
		}
		}
		return 0;
	}

}

