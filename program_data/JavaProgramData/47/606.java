package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		int[] rev_num = new int[1000];
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n - 1;
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			rev_num[m--] = num[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(rev_num[i]);
			System.out.print(" ");
		}
			System.out.print(rev_num[i]);

			return 0;
	}

}

