package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char max;
		while (scanf("%s%s",str,substr) != EOF)
		{

		int i;
		int t;
		int m;
		m = str.length();
		max = str.charAt(0);
		t = 0;
		for (i = 0;i <= m - 2;i++)
		{
			if (str.charAt(i + 1) > max)
			{
				max = str.charAt(i + 1);
			t = i + 1;
			}

		}
		for (i = 0;i <= t;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = t + 1;i <= m - 2;i++)
		{
		 System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%c\n",str.charAt(m - 1));
		}
	}

}
