package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		int f = char str.charAt(10);
		for (j = 0;scanf("%s %s",str,substr) != EOF;j++)
		{
		n = str.length();
		for (i = 0;i <= f(str);i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = f(str) + 1;i < n;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		}
	}
	public static int f(String str)
	{
		char c;
		int n;
		int i;
		int x = 0;
		c = str[0];
		n = str.length();
		for (i = 1;i < n;i++)
		{
			if (str[i].compareTo(c) > 0)
			{
				c = str[i];
				x = i;
			}
		}
		return (x);
	}
}
