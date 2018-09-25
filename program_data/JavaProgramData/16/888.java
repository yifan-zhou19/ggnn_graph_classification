package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
		   System.out.print(0);
		}
		else
		{
			int[] a = new int[5];
		a[0] = n / 10000;
		a[1] = (n - 10000 * a[0]) / 1000;
		a[2] = (n - 10000 * a[0] - 1000 * a[1]) / 100;
		a[3] = (n - 10000 * a[0] - 1000 * a[1] - 100 * a[2]) / 10;
		a[4] = n - 10000 * a[0] - 1000 * a[1] - 100 * a[2] - 10 * a[3];
		for (i = 0;i <= 4;i++)
		{
			if (a[i] != 0)
			{
				m = i;
				break;
			}
		}
		for (i = 4;i >= m;i--)
		{
			System.out.print(a[i]);
		}
		}



		return 0;
	}
}

