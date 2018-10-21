package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		final String str = "1";
		str = new Scanner(System.in).nextLine();
		for (k = 1;k < str.length() - 1;k++)
		{
			for (i = 0;i < str.length() - k;i++)
			{
				t = 0;
				for (j = 0;j < (k + 1) / 2;j++)
				{
					if (str.charAt(i + j) != str.charAt(i + k - j))
					{
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					for (j = i;j <= i + k;j++)
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
