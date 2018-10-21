package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		a[0] = 2;
		for (i = 0,t = 1;i < n - 1;i++)
		{
			for (j = 0,m = 0;j < t;j++)
			{
				a[j] = a[j] + a[j] + m;
				if (a[j] > 9)
				{
					a[j] = a[j] - 10;
					m = 1;
					t++;
				}
				else
				{
					m = 0;
				}
			}
		}
		for (i = 99;i > 0;i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (j = i;j >= 0 && n != 0;j--)
		{
			System.out.print(a[j]);
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		System.out.print("\n");
		return 0;
	}
}

