package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					count++;
					a[i] = 0;
				}
			}
		}
		System.out.print(a[1]);
		for (int i = 2;i <= n;i++)
		{
			if (a[i] != 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

