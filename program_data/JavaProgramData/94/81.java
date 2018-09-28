package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //???
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //??????
		for (int i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++) //????
		{
			for (int j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (int i = 0;i < n;i++) //????????
		{
			if (a[i] % 2 == 1 && i == 0)
			{
				System.out.print(a[i]);
			}
			else if (a[i] % 2 == 1 && i != 0)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

