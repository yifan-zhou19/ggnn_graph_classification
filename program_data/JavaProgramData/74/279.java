package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		int sum = 0;
	int[] a = new int[100];
	int[] b = new int[100];
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
		for (j = 2;j <= i / 2 + 1;j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
			if (j > i / 2)
			{
				for (j = 1;j < 100;j++)
				{
			if (i / (Math.pow(10,j)) < 1)
			{
				break;
			}
				}
			p = i;
			 for (k = j - 1;k >= 0;k--)
			 {
				 a[k] = (p / Math.pow(10,k));

			 p = (p - a[k] * Math.pow(10,k));

			 b[j - k - 1] = a[k];
			 }
	for (k = 0;k < j;k++)
	{
	if (b[k] != a[k])
	{
	break;
	}
	}

	if (k == j)
	{
		if (sum != 0)
		{
	System.out.print(",");
		}
		System.out.printf("%d",i);
	sum++;
	}
			}

	}
	if (sum == 0)
	{
	System.out.print("no");
	}

	}
}

