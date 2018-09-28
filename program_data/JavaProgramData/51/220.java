package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[500];
		int t;
		int i;
		int j;
		int k;
		int max;
		String s = new String(new char[500]);
		char[][] a = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length() - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = s.charAt(i + j);
			}
		}
		for (i = 0;i < s.length() - n + 1;i++)
		{
			b[i] = 1;
			for (j = i + 1;j < s.length() - n + 1;j++)
			{
				t = 0;
				for (k = 0;k < n;k++)
				{
					if (a[i][k] != a[j][k])
					{
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					b[i]++;
				}
			}
		}
		max = 0;
		for (i = 0;i < s.length() - n + 1;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < s.length() - n + 1;i++)
		{
			if (b[i] == max)
			{
				System.out.println(a[i]);
			}
		}
		}
		return 0;
	}

}

