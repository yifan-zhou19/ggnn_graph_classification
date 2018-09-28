package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[500]);
		ch = new Scanner(System.in).nextLine();
		int i;
		int len;
		int j;
		int k;
		len = ch.length();
		for (i = 2;i <= len - 1;i++)
		{
				int n;
				n = (i - 2) / 2;
			for (j = 0;j <= len - i;j++)
			{
				int h = 0;
				int m = 0;
				for (k = j;k <= j + n;k++)
				{
					if (ch.charAt(k) == ch.charAt(j + i - 1 + m))
					{
						h++;
						m--;
					}
					else
					{
						break;
					}
					if (h == (i / 2))
					{
						int l;
						for (l = j;l <= j + i - 1;l++)
						{
							System.out.printf("%c",ch.charAt(l));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}
