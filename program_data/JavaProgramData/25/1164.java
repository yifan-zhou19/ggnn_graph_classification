package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] temp = new int[100];
		a[99] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 99 ; j >= 0 ; j--)
			{
				if (j != 0)
				{
				temp[j - 1] = (a[j] * 2 + temp[j]) / 10;
				}
				a[j] = (a[j] * 2 + temp[j]) % 10;
			}
		}
		for (i = 0 ; i < 100 ; i++)
		{
			if (a[i] != 0)
			{
			break;
			}
		}
		for (j = i ; j < 100 ; j++)
		{
			System.out.print(a[j]);
		}
		return 0;
	}
}

