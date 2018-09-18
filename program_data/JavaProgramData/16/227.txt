package <missing>;

public class GlobalMembers
{
	public static int e(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return 10 * e(n - 1);
		}
	}
	public static int Main()
	{
		int N;
		int[] a = new int[4];
		int i = 0;
		int t = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N != 0)
		{
			while (N % (1 * e(i)) != N)
			{
				a[i] = (N % (1 * e(i + 1)) - N % (1 * e(i))) / (1 * e(i));
				i++;
			}
			while (t <= i - 1)
			{
				System.out.printf("%d",a[t]);
				t++;
			}
		}
		else
		{
			System.out.print("0\n");
		}
		return 0;
	}
}

