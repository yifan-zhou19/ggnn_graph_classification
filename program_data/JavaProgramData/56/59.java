package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		int t = 0;
		int x = 0;
		int[] s = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;

		while (m > 0)
		{
			m = m / 10;
			t++;
		}

		for (i = t;i >= 1;i--)
		{
			s[i] = (int)n / Math.pow(10,i - 1);
			n = n - (int)s[i] * Math.pow(10,i - 1);
		}




		for (i = 1;i <= t;i++)
		{
			x = x + s[i] * Math.pow(10,t - i);
		}

	System.out.printf("%d\n",x);

	}

}

