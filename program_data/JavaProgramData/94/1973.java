package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int odd = 0;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t % 2 != 0)
			{
				a[odd] = t;
				odd++;
			}
		}
		for (int i = 0;i < odd - 1;i++)
		{
			for (int j = 0;j < (odd - i - 1);j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (int i = 0;i < odd - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(',');
		}
		System.out.print(a[odd - 1]);
		return 0;
	}
}

