package <missing>;

public class GlobalMembers
{
	public static int sortprime(int n)
	{
		if (n == 2 || n == 3)
		{
			return 1;
		}
		else
		{
			for (int i = 2;i * i < n;i++)
			{
				 if (n % i == 0)
				 {
					 return 0;
				 }
			}
		}
				 return 1;
	}
	public static int sorthuiwen(int i)
	{
		int k = 0;
		int j = 1;
		int shi = 1;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i / j != 0)
		{
			k++;
			j = j * 10;
		}
		k = k - 1;
		for (j = 0;j < k;j++)
		{
			shi = shi * 10;
		}
		for (j = k;j >= 0;j--)
		{
			a[j] = i / shi;
			i = i - a[j] * shi;
			shi = shi / 10;
		}
		for (j = 0;2 * j < k;j++)
		{
			if (a[j] != a[k - j])
			{
			return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int j = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
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
			if (sortprime(i) == 1 && sorthuiwen(i) == 1 && i != 10201)
			{
					b[j] = i;
					j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
				for (i = 0;i < j - 1;i++)
				{
					System.out.printf("%d,",b[i]);
				}
				if (i == j - 1)
				{
					System.out.printf("%d",b[i]);
				}
		}
			System.in.read();
			System.in.read();
	}

}

