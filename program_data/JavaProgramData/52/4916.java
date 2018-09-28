package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????????
		int m;
		int i;
		int j;
		int t;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //???????????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			t = a[i];
			a[i] = a[n - m + i]; //?m???????????????????
			for (j = n - m + i;j > i;j--) //?n-m????????
			{
				if (j == i + 1)
				{
					a[j] = t;
				}
				else
				{
					a[j] = a[j - 1];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

