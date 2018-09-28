package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int jinwei;
		int[] a = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 1;i <= n;i++)
		{
			jinwei = 0;
			for (j = 0;j < 49;j++)
			{
				a[j] = a[j] * 2 + jinwei;
				if (a[j] >= 10)
				{
					a[j] = a[j] - 10;
					jinwei = 1;
				}
				else
				{
					jinwei = 0;
				}
			}
		}
		i = 49;
		while (a[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

