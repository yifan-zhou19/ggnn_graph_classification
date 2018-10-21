package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] compute = new int[32];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < 32; j++)
			{
				compute[j] += a[j] * 2;
			}
			for (int j = 0; j < 32; j++)
			{
				compute[j + 1] += compute[j] / 10;
				compute[j] %= 10;
			}
			for (int j = 0; j < 32; j++)
			{
				a[j] = compute[j];
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(compute, 0, (Integer.SIZE / Byte.SIZE));
		}
		for (k = 31; k >= 0; k--)
		{
			if (a[k] != 0)
			{
				break;
			}
		}
		for (int i = k; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

