package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		str = new Scanner(System.in).nextLine();

		int len = 0;
		while (str.charAt(len) != null)
		{
			len++;
		}
		int l = 2;
		int i;
		int j;
		char y;
		for (l = 2;l <= len;l++)
		{
			i = 0;
			for (i = 0;i < len - l + 1;i++)
			{
				y = 'y';
				for (j = i;j < l + i;j++)
				{
					if (str.charAt(j) != str.charAt(l + 2 * i - 1 - j))
					{
						y = 'n';
					}
				}
				if (y == 'y')
				{
					for (j = i;j < l + i;j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}


		return 0;
	}
}
