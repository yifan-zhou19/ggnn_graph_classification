package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[999];
		int k = 0;
		int[] b = new int[999];
		int i;
		int m;
		int p;
		int j;
		int q;
		while ((n = System.in.read()) != '\n')
		{
			if (n <= 'z' && n >= 'a')
			{
				for (i = 0;i < k;i++)
				{
					if (a[i] == n)
					{
						b[i]++;
						break;
					}
				}
				if (i == k)
				{
					a[i] = n;
					b[i]++;
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 1;j <= k;j++)
			{
			m = 199;
			for (i = 0;i <= k - 1;i++)
			{
				if (a[i] < m)
				{
					m = a[i];
					p = b[i];
					q = i;
				}
			}
			System.out.printf("%c=%d",m,p);
			a[q] = 200;
			if (j != k)
			{
				System.out.print('\n');
			}
			}
		}
	}


}
