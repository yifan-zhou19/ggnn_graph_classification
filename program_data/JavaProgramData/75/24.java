package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		int n = 0;
		int i;
		int j;
		int k = 1;
		int max;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				n = n * 10 + c - '0';
			}
			else
			{
				x[k] = n;
				k++;
				n = 0;
			}
		}
		x[k] = n;
		n = 0;
		k = 1;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				n = n * 10 + c - '0';
			}
			else
			{
				y[k] = n;
				k++;
				n = 0;
			}
		}
		y[k] = n;
		for (i = 1;i <= k;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				t[j]++;
			}
		}
		max = t[0];
		for (i = 1;i < 999;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d\n",k,max);
		return 0;
	}

}
