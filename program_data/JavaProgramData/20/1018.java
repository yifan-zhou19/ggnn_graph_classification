package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		char m;
		while (scanf("%s%s",str,substr) != EOF)
		{
		n = str.length();
		m = str.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) > m)
			{
				m = str.charAt(i);
				max = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",str.charAt(i));
			if (i == max)
			{
			System.out.printf("%s",substr);
			}
		}
		System.out.print("\n");
		}
		return 0;
	}
}
