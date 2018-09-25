package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[90];
		int[] a = new int[20001];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[a[1] - 10]++;
		System.out.print(a[1]);
		for (i = 2;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[a[i] - 10]++;
			if (num[a[i] - 10] == 1)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

