package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int[] m = new int[300];
		int i;
		int j;
		int k = 0;
		int t = 0;
		int[] a = new int[300];
		int num = 0;
		int[] s = new int[300];
		for (i = 0;i < 300;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
			for (j = 1;j <= n[i];j++)
			{
				a[j] = 1;
			}
			while (num < n[i])
			{
				k++;
				if (k == n[i] + 1)
				{
					k = 1;
				}
				if (a[k] != 0)
				{
					t++;
					if (t == m[i])
					{
						a[k] = 0;
						t = 0;
						num++;
						s[i] = k;
					}
				}
			}
			k = t = num = 0;
			for (j = 1;j < 300;j++)
			{
				a[j] = 0;
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.print(s[j]);
			System.out.print("\n");
		}
		return 0;
	}
}

