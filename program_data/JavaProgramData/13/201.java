package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 1;
		int i = 0;
		int n = 0;
		int j = 0;
		int k = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000];
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[0]);
		for (i = 1;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 1;
			for (j = 0;j < i;j++)
			{
			if (a[i] == a[j])
			{
				k = 0;
				break;
			}
			}
			if (k == 1)
			{
			System.out.print(" ");
			System.out.print(a[i]);
			}

		}
		return 0;
	}
}

