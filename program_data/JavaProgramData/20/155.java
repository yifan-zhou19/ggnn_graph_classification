package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0'};
		char m = 0;

		while (scanf("%s %s",str,substr) == 2)
		{
			m = 0;
			n = 0;

		for (i = 0;i < 10;i++)
		{
			if (str[i] > m)
			{
				m = str[i];
				n = i;
			}
		}


		for (i = 0;i <= n;i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.printf("%s",substr);
		for (i = n + 1;i < str.length();i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.print("\n");




		}
		return 0;
	}

}
