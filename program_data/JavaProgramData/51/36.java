package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[501]);
		int[] f = new int[501];
		int n;
		int i;
		int j;
		int k;
		int p;
		int count;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		z = new Scanner(System.in).nextLine();
		for (i = 0;i < z.length() - n + 1;i++)
		{
			f[i] = 1;
		}


		for (i = 0;i < z.length() - 2;i++)
		{
			for (j = i + 1;j < z.length() - 1;j++)
			{
				count = 0;
				for (p = 0;p < n;p++)
				{
					if (z.charAt(i + p) == z.charAt(j + p))
					{
						count++;
					}
					else
					{
						break;
					}
				}
				if (count == n)
				{
					f[i]++;
				}
			}
		}
		int max = 1;
		for (k = 0;k < z.length() - n + 1;k++)
		{
			if (f[k] > max)
			{
				max = f[k];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n",max);

		for (k = 0;k < z.length() - n + 1;k++)
		{
			if (f[k] == max)
			{
				for (p = 0;p < n;p++)
				{
					System.out.printf("%c",z.charAt(k + p));
				}
				System.out.print("\n");
			}

		}

		return 0;

	}
}

