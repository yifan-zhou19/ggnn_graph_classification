package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int[] num = new int[500];
		int len;
		int k;
		int m;
		int max = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 0; i <= len - m; i++)
		{
			for (j = i + 1; j <= len - m; j++)
			{
				for (k = 0; k < m; k++)
				{
					if (str.charAt(i + k) != str.charAt(j + k))
					{
						break;
					}
				}
				if (k == m)
				{
					num[i]++;
				}
			}
		}
		for (i = 0; i <= len - m; i++)
		{
			if (max < num[i] + 1)
			{
				max = num[i] + 1;
			}
		}
		if (max < 2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i <= len - m; i++)
			{
				if (max == num[i] + 1)
				{
					for (k = 0; k < m; k++)
					{
						System.out.print(str.charAt(i + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

