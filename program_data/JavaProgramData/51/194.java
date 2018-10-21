package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[502]);
		char[][] b = new char[502][6];
		char c;
		int i;
		int j;
		int n;
		int imax;
		int max;
		int[] m = new int[502];
		int p;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = System.in.read();
		a = new Scanner(System.in).nextLine();
		p = a.length();
		for (i = 0;i < p - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
		}
		for (i = 0;i < p - n + 1;i++)
		{
			m[i] = 1;
			for (j = i + 1;j < p - n + 1;j++)
			{
				if (b[j][0] != '\0')
				{
					for (k = 0;k < n;k++)
					{
						if (b[i][k] != b[j][k])
						{
							break;
						}
					}
					if (k >= n)
					{
						b[j][0] = '\0';
						m[i]++;
					}
				}
			}
		}
		max = m[0];
		imax = 0;
		for (i = 0;i < p - n + 1;i++)
		{
			if (m[i] > max)
			{
				max = m[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < p - n + 1;i++)
			{
				if (m[i] >= max)
				{
					imax++;
				}
			}

		System.out.printf("%d\n",max);
		for (i = 0;i < p - n + 1;i++)
		{
			if (m[i] >= max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

