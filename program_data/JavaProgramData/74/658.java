package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int hws = 0;
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
		int s = n - m + 1;
		int[] a;
		a = new int[s];
		int[] reversed_number;
		reversed_number = new int[s];
		int[] remainder;
		remainder = new int[s];
		int[] b;
		b = new int[s];
		for (k = 0;k < s;k++)
		{
			a[k] = 0;
			reversed_number[k] = 0;
			remainder[k] = 0;
			b[k] = k + m;
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (b[i - m] % j == 0)
				{
					a[i - m]++;
				}
			}
		}
		for (i = m;i <= n;i++)
		{
			if (a[i - m] == 0)
			{
				while (b[i - m] != 0)
				{
					remainder[i - m] = b[i - m] % 10;
					reversed_number[i - m] *= 10;
					reversed_number[i - m] += remainder[i - m];
					b[i - m] = b[i - m] / 10;
				}
			}
			if (reversed_number[i - m] == i)
			{
				hws++;
			}
		}
		if (hws == 0)
		{
			System.out.print("no");
		}
		int c = 0;
		if (hws != 0)
		{
			for (i = m;i <= n;i++)
			{
				if (reversed_number[i - m] == i && i != 1 && i != 2)
				{
					c = i;
					System.out.printf("%d",i);
					break;
				}
			}
		}
		if (hws != 0)
		{
			for (j = c + 1;j <= n;j++)
			{
				if (reversed_number[j - m] == j && j != 1 && j != 2)
				{
					System.out.printf(",%d",j);
				}
			}
		}
	}


}

