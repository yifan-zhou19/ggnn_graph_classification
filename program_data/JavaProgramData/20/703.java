package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char t;
		char s1;
		char s2;
		int j = 0;
		int i;
		int len;
		int k;
		while (scanf("%s%s",str,substr) != EOF)
		{
			k = 0;
			len = str.length();
			t = str.charAt(0);
			for (i = 1;i < len;i++)
			{
				if (t < str.charAt(i))
				{
					k = i;
					t = str.charAt(i);
				}
			}

			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = k + 1;i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");

		}

	}




}
