package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		int j;
		int max = 0;
		int len;
		while (scanf("%s%s",str,substr) != EOF)
		{
		len = str.length();
		max = 0;
		for (j = 0;j < len;j++)
		{
		if (str.charAt(max) < str.charAt(j + 1))
		{
		max = j + 1;
		}
		}
		for (i = 0;i < len;i++)
		{
		System.out.printf("%c",str.charAt(i));
		if (i == max)
		{
			System.out.printf("%s",substr);
		}
		}
		System.out.print("\n");
		}
	}
}
