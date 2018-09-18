package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int[] a = new int[5];
		int i;
		int c;
		int n;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 0;
		for (i = 4 ; i >= 0 ; i--)
		{
			for (j = 1 ; j <= i ; j++)
			{
				c *= 10;
			}
			a[i] = ((num - num % c) / c) % 10;
			c = 1;
		}
		for (i = 4 ; i >= 0 ; i--)
		{
			if (a[i] != 0)
			{
				n = i;
				break;
			}
		}
		for (i = 0 ; i <= n ; i++)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

