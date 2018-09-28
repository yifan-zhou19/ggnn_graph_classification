package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int c;
		int k;
		int d;
		int i;
		int sum;
		int e;
		int j;
		int m;
		m = 6;
		int[] b = new int[10];
		for (j = 0;j <= m - 1;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		if (c < 0)
		{
			System.out.print("-");
		}
		d = Math.abs(c);
		k = Math.log10(d);
		for (i = k;i >= 0;i--)
		{
			b[i] = d / Math.pow(10,i);
			d = d - b[i] * Math.pow(10,i);
		}
		for (i = 0;i <= k;i++)
		{
			if (b[i] != 0)
			{
				e = i;
				break;
			}
		}
		sum = b[k];
		for (i = k - 1;i >= e;i--)
		{
			sum = sum + b[i] * Math.pow(10,k - i);
		}
		System.out.printf("%d\n",sum);
		}
	}



}

