package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int l;
		int k;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 2;i <= a.length();i++)
		{
			for (j = 0;j <= (a.length() - i);j++)
			{
				for (l = j,k = j + i - 1;l <= k;l++,k--)
				{
					if (a.charAt(l) == a.charAt(k))
					{
					m = 1;
					}
					else
					{
						m = 0;
						break;
					}
				}
				if (m == 1)
				{
					for (k = j;k < j + i;k++)
					{
					System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}
