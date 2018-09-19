package <missing>;

public class GlobalMembers
{
	public static int max(String str, int i, int l)
	{
		int o;
		for (o = 0;o < l;o++)
		{
			if (str[o].compareTo(str[i]) > 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s %s",str,substr) != EOF)
		{
		int l;
		l = str.length();
		int i;
		for (i = 0;i < l;i++)
		{
			if (max(str, i, l) == 1)
			{
				break;
			}
		}
		int j;
		int k;
		for (j = 0;j <= i;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		for (k = 0;k < 3;k++)
		{
			System.out.printf("%c",substr.charAt(k));
		}
		for (j = i + 1;j < l;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		System.out.print("\n");

		}
	}




}
