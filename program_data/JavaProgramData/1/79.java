package <missing>;

public class GlobalMembers
{
	public static int func(int m,int q)
	{
		int[] b = new int[100];

		int i;
		int j;
		int k = 0;
		int p = 0;
		int sum = 1;
		for (j = q;j <= m;j++)
		{
			if (j * j > m)
			{
				p = k;
				break;
			}
			if (m % j == 0)
			{
				b[k] = j;
				k++;
			}

		}
		if (k > 2 || p != 0 && m != 2)
		{
			for (i = 0;i < p;i++)
			{
				sum += func(m / b[i], b[i]);
			}
			return (sum);
		}
		else
		{
			return (1);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int m;
		int[] b = new int[100];
		int[] a = new int[100];
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
				m = Integer.parseInt(tempVar2);
			}
			b[i] = func(m, 2);
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",b[j]);
		}
	}
}

