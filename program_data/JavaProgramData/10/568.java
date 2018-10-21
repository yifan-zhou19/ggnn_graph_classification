package <missing>;

public class GlobalMembers
{
	public static void make(int[] hight, int n)
	{
		int i = 0;
		int j = 0;
		int[] a = new int[26];
		int max = 0;
		a[1] = 1;
		for (i = 2; i <= n; i++)
		{
			a[i] = 1;
			for (j = 1; j < i; j++)
			{
				if ((hight[j] >= hight[i]) && (a[j] + 1 > a[i]))
				{
					a[i] = a[j] + 1;
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			max = (max > a[i] != 0 ? max : a[i]);
		}
		System.out.print(max);
	}

	public static int Main()
	{
		int n = 0;
		int[] hight = new int[26];
		int i = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n ; i++)
		{
			hight[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		make(hight, n);

		return 0;
	}

}

