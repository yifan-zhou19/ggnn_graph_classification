package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		a[0] = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 0;j < 100;j++)
			{
				a[j] *= 2;
			}
			for (int j = 0;j < 100;j++)
			{
				if (a[j] >= 10)
				{
					a[j] -= 10;
					a[j + 1]++;
				}
			}
		}
		int len = 0;
		for (int i = 99;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				len = i;
				break;
			}
		}
		for (int i = len;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

