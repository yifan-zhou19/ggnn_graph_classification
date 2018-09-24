package <missing>;

public class GlobalMembers
{
	public static void exponent(int[] a, int n)
	{
		if (n == 0)
		{
			return;
		}
		else
		{
			int i;
			int k;
			for (i = 199; a[i] == 0; i--)
			{
				;
			}
			for (k = 0; k <= i; k++)
			{
				a[k] = a[k] * 2;
			}
			for (k = 0; k <= i; k++)
			{
				a[k + 1] = a[k] / 10 + a[k + 1];
				a[k] = a[k] % 10;
			}
			exponent(a, n - 1);
			return;

		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		exponent(a, n);
		for (i = 199; a[i] == 0; i--)
		{
			;
		}
		for (;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

