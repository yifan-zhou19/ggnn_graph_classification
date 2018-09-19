package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int k;
		String str = new String(new char[11]);
		String strsub = new String(new char[4]);
		for (j = 0;;j++)
		{
			k = 0;
			if (scanf("%s%s",str,strsub) == EOF)
			{
				break;
			}
			m = str.length();
			for (i = 0;i < m;i++)
			{
				if ((str.charAt(k) - str.charAt(i)) < 0)
				{
					k = i;
				}
			}
			for (i = 0;i < k + 1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",strsub);
			for (i = k + 1;i < m;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}
}
