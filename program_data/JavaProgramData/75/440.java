package <missing>;

public class GlobalMembers
{
	public static void count(int n, int[] x, int[] y, int[] a)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				a[j]++;
			}
		}
	}
	public static int findmax(int[] a)
	{
		int i;
		int max = 0;
		for (i = 1; i <= 1000; i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}

		return max;


	}
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] a = new int[1001];
		int n = 0;
		int i;
		for (i = 0; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			if (System.in.read() != ',')
			{
				break;
			}
		}

		for (i = 0; i < n; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}

		count(n, x, y, a);
		System.out.print(n);
		System.out.print(" ");
		System.out.print(findmax(a));
		return 0;
	}

}

