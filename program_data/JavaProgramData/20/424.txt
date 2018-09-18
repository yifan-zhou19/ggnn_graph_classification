package <missing>;

public class GlobalMembers
{
	public static void start()
	{
		int i;
		int lenstr;
		int lensub;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char max;
		char t;

		while (scanf("%s%s",str,substr) != EOF)
		{
			lenstr = str.length();
		lensub = substr.length();
		max = str.charAt(0);
		for (i = 1;i < lenstr;i++)
		{
			if (max < str.charAt(i))
			{
			max = str.charAt(i);
			t = i;
			}
		}
		for (i = 0;i <= t;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		for (i = 0;i < lensub;i++)
		{
			System.out.printf("%c",substr.charAt(i));
		}
		for (i = t + 1;i < lenstr;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		start();

		}
	}
	public static void Main()
	{
		start();
	}
}
