package <missing>;

public class GlobalMembers
{
	public static int max(String s1)
	{
		int i;
		int k = 0;
		char c = 0;
		for (i = 0;i < s1.length();i++)
		{
			if (s1[i].compareTo(c) > 0)
			{
				c = s1[i];
				k = i;
			}
		}
		return (k);
	}
	public static void Main()
	{
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		int i;
		int j;
		int m;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			m = max(s1);
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			System.out.printf("%s",s2);
			for (i = m + 1;i < s1.length();i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			System.out.print("\n");
		}
	}


}
