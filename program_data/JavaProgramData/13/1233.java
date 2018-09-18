package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			int t = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
				t++;
				break;
				}
			}

		if (t == 0)
		{
			if (m > 0)
			{
				System.out.print(" ");
			}
			System.out.print(a[i]);
		m++;
		}
		}
		return 0;
	}

}

