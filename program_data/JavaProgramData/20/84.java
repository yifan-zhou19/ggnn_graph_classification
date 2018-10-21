package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void in(char str[], char substr[]);
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		while ((scanf("%s%s", str, substr)) != EOF)
		{
			in(str, substr);
		}
	}

	public static void in(String str, String substr)
	{
		int i;
		int k;
		int max;
		int l;
		l = str.length();
		max = str[0];
		for (i = 1;i < l;i++)
		{
			if (max < str[i])
			{
				max = str[i];
				k = i;
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.printf("%s",substr);
		for (i = k + 1;i < l;i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.print("\n");
	}

}
