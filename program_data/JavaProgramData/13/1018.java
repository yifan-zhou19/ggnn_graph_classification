package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int i;
		int[] flag = new int[91];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{

			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		flag[a[0] - 10] = 1;
		for (i = 0; i < n; i++)
		{
			if (flag[a[i] - 10] == 0)
			{
				System.out.print(' ');
				System.out.print(a[i]);
				flag[a[i] - 10] = 1;

			}
			else
			{
				continue;
			}
		}
		return 0;

	}
}

