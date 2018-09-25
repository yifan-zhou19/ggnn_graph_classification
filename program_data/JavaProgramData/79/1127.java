package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int[] b = new int[301];
		int i;
		int n;
		int m;
		int k;
		int t;
		int count;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 1; i <= n; i++)
			{
				a[i] = 1;
			}
			k = 0;
			t = 0;
			count = 1;
			while (count <= n)
			{
				k++;
				if (k == n + 1)
				{
					k = 1;
				}
				if (a[k] != 0)
				{
					t++;
					if (t == m)
					{
						a[k] = 0;
						b[count] = k;
						count++;
						t = 0;
					}
				}
			}
			System.out.print(b[n]);
			System.out.print("\n");
		}
		return 0;
	}

}

