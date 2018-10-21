package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huige = int a;
		int n;
		int i;
		int j;
		int l;
		int[] a = new int[50000];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 2;
		j = 1;
		for (i = 3;i < n;i = i + 2)
		{
			if (huige(i) == 1)
			{
				a[j] = i;
				j++;
			}
		}
		for (l = 6;l <= n;l = l + 2)
		{
			k = 0;
			for (i = 0;i < j;i++)
			{
				if (huige(l - a[i]) == 1)
				{
				System.out.printf("%d=%d+%d\n",l,a[i],l - a[i]);
				k = 1;
				}
			if (k == 1)
			{
				break;
			}
			}
		}
	}
	public static int huige(int a)
	{
		int i;
		int m = 1;
		for (i = 3;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				m = 0;
			}
		}
		if (a % 2 == 0)
		{
			m = 0;
		}
		return (m);
	}

}

