package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

					//i??????
		while (true)
		{
			int m;
			int n;
			int j = 1;
			int count;
			int k = 1;
			int i = 0;
			int[] a = new int[301];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			count = n;
			j = 0;
			while (count > 1)
			{
				i++;
				while (true)
				{
					if (k > n)
					{
						k -= n;
					}
					if (a[k] == 0)
					{
						break;
					}
					k++;
				}
				if (i == m)
				{
					a[k] = 1;
					i = 0;
					count--;
					k++;
					continue;
				}
				k++;
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] == 0)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

