package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int m;
		int n;
		int[] sum = new int[500];
		String b = new String(new char[600]);
		char[][] a = new char[510][5];
		String c = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		b = new Scanner(System.in).nextLine();
		m = b.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				a[k][j - i] = b.charAt(j);
			}
			a[k][j] = '\0';
			k += 1;
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				for (m = 0;m < n;m++)
				{
					if (a[i][m] != a[j][m])
					{
						m = 0;
						break;
					}
				}
				if (m != 0)
				{
					sum[i] += 1;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (sum[j] < sum[j + 1])
				{
					m = sum[j + 1];
					sum[j + 1] = sum[j];
					sum[j] = m;
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		if (sum[0] != 1)
		{
			System.out.printf("%d\n",sum[0]);
			for (i = 0;i < k;i++)
			{
				if (sum[i] < sum[0])
				{
					break;
				}
				else
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

