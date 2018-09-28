package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k;
		int l;
		int n = str.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j <= n - i;j++)
			{
				int flag = 1;
				for (k = j,l = k + i - 1;k <= (j + (i - 1) / 2);k++,l--)
				{
					if (str.charAt(k) != str.charAt(l))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (k = j;k < j + i;k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

