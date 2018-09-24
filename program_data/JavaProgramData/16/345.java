package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int[] a = new int[5];
		int i;
		int j;
		int[] b = new int[5];
		int c;
		int d;
		int k;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == 0)
		{
			System.out.print(x);
		}
		else
		{
			a[1] = x / 10000;
			a[2] = (x % 10000) / 1000;
			a[3] = (x % 1000) / 100;
			a[4] = (x % 100) / 10;
			a[5] = (x % 10);
			for (i = 1;; i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			c = i;
			for (i = 5; i >= c; i--)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

