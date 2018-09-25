package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int max;
		while (scanf("%s %s",str,substr) != EOF)
		{
		n = str.length();
		String p1;
		String p2;
		String p3;
		p1 = str,p2 = str,p3 = str;
		max = str.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (*(p1.Substring(i)) > max)
			{
				max = (p1.Substring(i));
				p2 = p1.Substring(i);
			}
		}
		for (p1 = str;p1 < (p2.Substring(1));p1++)
		{
			System.out.printf("%c", p1);
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",substr.charAt(i));
		}
		for (p1 = p2.Substring(1);p1 < (p3.Substring(n));p1++)
		{
			System.out.printf("%c", p1);
		}
		System.out.print("\n");
		}
	}

}
