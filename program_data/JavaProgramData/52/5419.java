package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] num = new int[100];
		int a;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[i] = a;
		}
		for (i = n - m - 1;i < n - 1;i++)
		{
			for (j = i;j >= i + m + 1 - n;j--)
			{
				t = num[j];
				num[j] = num[j + 1];
				num[j + 1] = t;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(' ');
		}
		System.out.print(num[n - 1]);
		return 0;
	}

}

