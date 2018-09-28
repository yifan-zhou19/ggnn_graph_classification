package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i = 1;
		int j = 1;
		int k = 1;
		int[] sum = new int[100];
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j <= n; j++)
		{
		if ((a[j] >= 90) && (a[j] <= 140) && (b[j] >= 60) && (b[j] <= 90))
		{
			sum[k]++;
		}
		else
		{
			k++;
		}
		}
		for (k = 1; k <= n; k++)
		{
			if (sum[k] >= max)
			{
				max = sum[k];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

