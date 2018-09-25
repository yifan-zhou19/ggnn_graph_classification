package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200001];
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[1]);
		for (i = 2; i <= n; i++)
		{
			for (j = 1; j < i; j++)
			{
				if (a[j] == a[i])
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
			flag = 0;
		}
		return 0;
	}
}

