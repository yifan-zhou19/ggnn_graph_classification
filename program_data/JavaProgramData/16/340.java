package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; // ?????????????????
		int[] a = new int[6];
		int m = 0;
		int j;
		int i;
		int p = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;;i++)
		{
		a[i] = n % 10;
		n = (n - a[i]) / 10;
		if (n != 0)
		{
			p += 1;
		}
		else
		{
			break;
		}
		} //????????????
		for (i = 0;i <= p;i++)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

