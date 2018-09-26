package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int Main()
	{
		int n;
		int m;
		int s;
		int k;
		int p;
		int i;
		int j;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m,n != 0 || m = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
			a[i] = 1;
			}
			p = n;
			if (n == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
			a[(m - 1) % p] = 0;
			s = ((m - 1) % p + 1) % p;
			for (n--;n > 1;n--)
			{
				k = m;
				while (k > 1)
				{
					if (a[s] == 1)
					{
						k--;
					}
					s++;
					s %= p;
				}
				while (a[s] == 0)
				{
					s++;
					s %= p;
				}
				a[s] = 0; //cout<<s<<endl;
			}
			for (i = 0;i < p;i++)
			{
			if (a[i] != 0)
			{
			System.out.print(i + 1);
			System.out.print("\n");
			}
			}
			}
		}
		return 0;
	}

}

