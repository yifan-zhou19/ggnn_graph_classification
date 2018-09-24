package <missing>;

public class GlobalMembers
{
	public static int find(String str)
	{
		int max;
		int j;
		int k;
		max = str[0];
		k = 0;
		for (j = 0; !str[j].equals('\0');j++)
		{
			if (str[j].compareTo(max) > 0)
			{
				max = str[j];
				k = j;
			}
		}
		return k;
	}
	public static void link(String str, String substr, int i)
	{
		int j;
		int len;
		len = str.length();
		for (j = len;j > i;j--)
		{
			str[j + 3] = str[j];
		}
		str[i + 1] = substr[0];
		str[i + 2] = substr[1];
		str[i + 3] = substr[2];
		System.out.printf("%s\n",str);
	}
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		int i;
		while (scanf("%s%s", str, substr) != EOF)
		{
			i = find(str);
			link(str, substr, i);
		}
	}



}
