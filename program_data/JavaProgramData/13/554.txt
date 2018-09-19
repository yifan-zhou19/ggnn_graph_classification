package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (int i = 1;i < n;i++)
		{
			t = 0;
			for (int j = 0;j < i;j++)
			{
				if (a[j] == a[i] && j != i)
				{
					t += 1;
				}
			}
			if (t >= 1)
			{
				continue;
			}
			else if (t == 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

