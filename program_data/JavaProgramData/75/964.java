package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] z = new int[1001];
		int n;
		int i;
		int j;
		int k;
		char a;
		for (i = 1; i <= 1000; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
			if (a == ',')
			{
				;
			}
			else
			{
				n = i;
				break;
			}
		}
		for (i = 1; i <= 1000; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
			if (a == ',')
			{
				;
			}
			else
			{
				break;
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = x[i]; j <= y[i] - 1; j++)
			{
				z[j]++;
			}
		}
		for (i = 1, k = 0; i <= 1000; i++)
		{
			if (z[i] > k)
			{
				k = z[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(k);
		return 0;
	}

}

