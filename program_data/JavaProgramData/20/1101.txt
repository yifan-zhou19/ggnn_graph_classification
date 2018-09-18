package <missing>;

public class GlobalMembers
{
	public static int max(String a)
	{
		int i;
		int t = a[0];
		for (i = 0;i <= a.length();i++)
		{
			if (t < a[i])
			{
				t = a[i];
			}
		}
		i = 0;
		while (!a[i].equals(t))
		{
			i++;
		}
		return i;
	}
	public static void Main()
	{
	String str = new String(new char[11]);
	String substr = new String(new char[4]);
	while (scanf("%s%s",str,substr) != EOF)
	{
		int i;
		int t = max(str);
		for (i = 0;i <= t;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = t + 1;i < str.length();i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
	}
	}


}
