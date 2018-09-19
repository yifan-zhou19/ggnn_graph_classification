package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s %s", str, substr) != EOF)
		{
			n = str.length();
			for (i = 0;i < n;i++)
			{
				k = 0;
				for (j = 0;j < n;j++)
				{
					if (str.charAt(i) >= str.charAt(j))
					{
						k++;
					}
				}
				if (k == n)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (j = i + 1;j < n;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
		System.out.print("\n");
		}
		return 0;
	}
}
