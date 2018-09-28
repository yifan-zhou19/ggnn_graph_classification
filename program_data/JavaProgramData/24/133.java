package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[200]);
		int n;
		int i;
		int j;
		int k;
		int s;
		int[] a = new int[800];
		int[] b = new int[800];
		int p;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (k = 0;k < n;k++)
		{
			if (str.charAt(k) == ' ')
			{
				break;
			}
		}
		a[k] = k;
		for (j = k + 1;j < n;j++)
		{
			if (str.charAt(j) != ' ')
			{
				for (i = j;i < n;i++)
				{
				if (str.charAt(i) == ' ')
				{
				a[i] = i;
				for (s = i - 1;s >= 0;s--)
				{
					if (a[s] != 0)
					{
					a[i] = a[i] - a[s] - 1;
					}
				}
				}
				}
			}
		}
		for (k = n - 1;k >= 0;k--)
		{
			if (str.charAt(k) == ' ')
			{
				break;
			}
		}
		a[n] = n - k - 1;
		for (i = 0;i <= n;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		b[0] = a[i];
		k = 0;
		for (i = i + 1;i <= n;i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			if (a[i] != 0)
			{
				k++;
				b[k] = a[i];
			}
		}
		for (i = 0;i <= k;i++)
		{
			for (j = i + 1;j <= k;j++)
			{
				if (b[j] > b[i])
				{
					p = b[j];
					b[j] = b[i];
					b[i] = p;
				}
			}
		}

		for (i = 0;i <= n;i++)
		{
			if (a[i] == b[0])
			{
				break;
			}
		}
		for (j = i - a[i];j < i;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		System.out.print("\n");
		for (i = 0;i <= n;i++)
		{
			if (a[i] == b[k])
			{
				break;
			}
		}
		for (j = i - a[i];j < i;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		System.out.print("\n");
	}


}
