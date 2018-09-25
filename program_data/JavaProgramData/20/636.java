package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k = 0;
		int i;
		int len;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			k = 0;
		len = str.length();
		for (i = 1;i < len;i++)
		{
			if (str.charAt(i) > str.charAt(k))
			{
				k = i;
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
