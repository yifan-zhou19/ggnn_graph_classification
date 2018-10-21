package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int changdu;
		int i;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[501]);
		int[] num = new int[501];
		int[] p = num;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		changdu = str.length();
		for (i = 0; i <= changdu - n; i++)
		{
			for (j = i; j <= changdu - n; j++)
			{
				for (k = 0; k <= n - 1; k++)
				{
					if (str.charAt(i + k) != str.charAt(j + k))
					{
						break;
					}
				}
				if (k == n)
				{
					p[i] = (p + i) + 1;
				}
				if (num[i] >= max)
				{
					max = (p + i);
				}
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i <= changdu - 1 - n; i++)
			{
				if (p[i] == max)
				{
					for (j = 0; j <= n - 1; j++)
					{
						System.out.print(str.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

