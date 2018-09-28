package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[100000];
		int[] b = new int[1000];
		int i;
		int j;
		int d;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 2;i < m - 1;i++)
		{
			if (i >= n)
			{
				if (a[i] == -1)
				{
					continue;
				}
			}
			for (j = i + 2;j <= m;j++)
			{
				if (j % i == 0)
				{
					a[j - n] = -1;
				}
			}
		}
		j = 0;
		for (i = n;i <= m;i++)
		{
			 if (a[i - n] == -1)
			 {
				 continue;
			 }
			 if (i % 10 == 0)
			 {
				 continue;
			 }
			 k = i;
			 d = 0;
			 while (k != 0)
			 {
				 d = d * 10 + k % 10;
				 k = k / 10;

			 }
			 if (d == i)
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
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != j - 1)
			{
				System.out.print(",");
			}
		}
	}
	}
}

