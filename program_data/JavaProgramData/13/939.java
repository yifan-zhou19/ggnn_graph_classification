package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n?????
		int i;
		int s;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //a??????????????1?????0
		int[] b = new int[n];
		for (i = 0;i <= n - 1;i = i + 1)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = 0;
		}
		for (i = n - 1,k = 0;i >= 1;i = i - 1)
		{
			for (s = i - 1;s >= 0;s = s - 1)
			{
				if (b[i] - b[s] == 0)
				{
					a[i] = 1; //??????a????1
					k = k + 1;
					break;
				}

			}
		}
			if (n - k == 1)
			{
				System.out.print(b[0]);
			}
			else
			{
		for (i = 0,l = 0;i <= n - 1;i = i + 1)
		{
			if (a[i] == 0)
			{
				l = l + 1;
				if (l - n + k < 0)
				{
					System.out.print(b[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(b[i]);
				}
			}
		}
			}
		return 0;
	}


}

