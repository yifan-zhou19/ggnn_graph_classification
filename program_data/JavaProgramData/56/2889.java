package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 6;i++)
		{
			a[i] = (((int)(n / Math.pow(10 * 1.0,(5 - i) * 1.0)) % 10)); //???????i????n/?10?5-i???
		}
		for (i = 1;i < 6;i++)
		{
			if (a[6 - i] != 0)
			{
			System.out.print(a[6 - i]);
			}
		}
		return 0;
	}
}

