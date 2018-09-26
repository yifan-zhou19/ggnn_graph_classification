package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[1000];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < n - 1; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				if (a[i] + a[j] == k)
				{
					flag = 1;
					System.out.print("yes");
					System.out.print("\n");
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}

}

