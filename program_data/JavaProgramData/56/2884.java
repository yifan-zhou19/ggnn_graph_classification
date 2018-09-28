package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int i;
		int[] b = new int[6];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 5;i++)
		{
			b[i] = (int)n / Math.pow(10 * 1.0,(5 - i) * 1.0);
			a[i] = b[i] % 10;

		}
		for (i = 1;i <= 5;i++)
		{
			if (a[6 - i] != 0)
			{
			System.out.print(a[6 - i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

