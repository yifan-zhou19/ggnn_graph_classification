package <missing>;

public class GlobalMembers
{
	public static int power(int x)
	{
		int k;
		int y = 1;
		for (k = 1;k <= x;k++)
		{
			y = y * 10;
		}
		return y;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[6];
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 5;i++)
		{
			if (n % power(i) == n)
			{
				j = i;
				break;
			}
		}
		i = 0;
		for (i = 0;i < j;i++)
		{
			a[i] = n % 10;
			n = n / 10;
			System.out.print(a[i]);
		}
		return 0;
	}
}

