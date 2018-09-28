package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100000];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0 ; i < n ; i++)
		{
			while (num[i] == k)
			{
				for (int j = i ; j < n - 1 ; j++)
				{
					num[j] = num[j + 1];
				}
				n--; //???????????
				if (i >= n)
				{
					break;
				}
			}
		}
		System.out.print(num[0]);
		for (int i = 1 ; i < n; i++)
		{
			System.out.print(' ');
			System.out.print(num[i]);
		}
		return 0;
	}
}

