package <missing>;

public class GlobalMembers
{
	public static String string = new String(new char[13]);
	public static void f(String str, String substr)
	{
		int i;
		int j;
		int k;
		int t;
		char max;
		max = str[0];
	k = 0;
		t = str.length();
		for (i = 1;i < t;i = i + 1)
		{
			if (str[i].compareTo(max) > 0)
			{
				max = str[i];
				k = i;
			}
		}
		for (i = 0;i <= k;i = i + 1)
		{
			String[i] = str[i];
		}
		j = 0;
		for (i = k + 1;i <= k + 3;i = i + 1)
		{
			String[i] = substr[j];
			j = j + 1;
		}
		if (k < t - 1)
		{
			j = k + 1;
			for (i = k + 4;i < t + 3;i = i + 1)
			{
				String[i] = str[j];
				j = j + 1;
			}
		}
	}
	public static void Main()
	{
	int i;
	String str = new String(new char[10]);
	String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			f(str, substr);
	for (i = 0;i < str.length() + 3;i = i + 1)
	{
	System.out.printf("%c",string.charAt(i));
	}
	System.out.print("\n");
		}
	}

}
