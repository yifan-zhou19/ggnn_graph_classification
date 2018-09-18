package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[5]);
		int i;
		int p;
		while (scanf("%s %s",str,substr) != EOF)
		{
			for (i = 0,p = 0;i < str.length();i++)
			{
				if (str.charAt(i) > str.charAt(p))
				{
					p = i;
				}
			}
				for (i = 0;i <= p;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.printf("%s",substr);
				for (i = p + 1;i < str.length();i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print("\n");
		}
	}


}
