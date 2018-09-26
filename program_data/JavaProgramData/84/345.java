package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????
		int i = 0;
		int max = 0;
		int cimax = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++) //?????
		{
			if (max < a[i])
			{
			   max = a[i];
			}
		}
		for (i = 0;i <= n - 1;i++) //?????
		{
			if (a[i] == max)
			{
			   a[i] = 0;
			}
		}
		for (i = 0;i <= n - 1;i++) //?????
		{
			if (cimax < a[i])
			{
			   cimax = a[i];
			}
		}
		System.out.print(max);
		System.out.print('\n');
		System.out.print(cimax);
		System.out.print("\n");
		return 0;
	}
}

