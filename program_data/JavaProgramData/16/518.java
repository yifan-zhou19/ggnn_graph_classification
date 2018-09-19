package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(0);
		}
		else
		{
			{
				for (i = 0;n > 0;i++)
				{
					a[i] = n % 10;
					n = n / 10;
				}
		}
		m = i;
		for (i = 0;i < m;i++)
		{
			System.out.print(a[i]);
		}
		}
		return 0;
	}

}

