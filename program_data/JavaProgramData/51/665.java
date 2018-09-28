package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int leng;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[501]);
		int[] num = new int[501];
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		leng = str.length();
		int i;
		int max = 0;
		for (i = 0; i <= leng - n; i++)
		{
			for (j = i; j <= leng - n; j++)
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
					num[i]++;
				}
				if (num[i] >= max)
				{
					max = num[i];
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
			for (i = 0; i <= leng - 1 - n; i++)
			{
				if (num[i] == max)
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

