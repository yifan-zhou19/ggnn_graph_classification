package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String o = new String(new char[501]);
		char[][] p = new char[501][501];
		char[][] q = new char[501][501];
		int i;
		int j;
		int k;
		int s = 1;
		int m = -1;
		int n;
		int[] a = new int[501];
		int[] b = new int[501];

		for (i = 0;i <= 500;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i <= 500;i++)
		{
			for (j = 0;j <= 500;j++)
			{
				p[i][j] = '\0';
				q[i][j] = '\0';
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		o = new Scanner(System.in).nextLine();
		for (i = 0;i < o.length() - n + 1;i++)
		{
			k = 0;
			for (j = i;j <= i + n - 1;j++)
			{
				p[i][k] = o.charAt(j);
				k++;
			}
		}
		for (j = 0;j < o.length() - n + 1;j++)
		{
			for (i = 0;i < o.length() - n + 1;i++)
			{
				if (strcmp(p[j],q[i]) == 0)
				{
					a[i]++;
					break;
				}
				else if (q[i][0] == '\0')
				{
					q[i] = p[j];
					break;
				}
			}
		}
		j = 0;
		for (i = 0;i < o.length();i++)
		{
			if (a[i] > s)
			{
				s = a[i];
			}
		}
		for (i = 0;i < o.length();i++)
		{
			if (a[i] == s)
			{
				b[j] = i;
				j++;
			}
		}
		if (s == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",s);
			for (i = 0;i < j;i++)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",q[b[i]][k]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

