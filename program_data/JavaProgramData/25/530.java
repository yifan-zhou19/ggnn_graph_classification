package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		a[0] = 2;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (k == 0)
		{
			System.out.print("1");
		}
		if (k == 1)
		{
			System.out.print("2");
		}
		if (k >= 2)
		{
		int i;
		int j;
		for (i = 0; i < k - 1 ;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				a[j] = 2 * a[j];
			}
			for (j = 0;j < 1000;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] = a[j + 1] + a[j] / 10;
					a[j] = a[j] % 10;
				}
			}
		}
		int flag = 0;
		for (i = 999; i >= 0;i--)
		{
			if (a[i] == 0 && flag == 0)
			{
				continue;
			}
			if (a[i] != 0)
			{
				System.out.print(a[i]);
				flag = 1;
			}
			if (a[i] == 0 && flag == 1)
			{
				System.out.print(a[i]);
			}
		}
		}
		int wo;
		wo = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

