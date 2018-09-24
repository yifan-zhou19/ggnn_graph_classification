package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		char c;
		int i;
		int Max;
		while (scanf("%s%s",str,substr) != EOF)
		{
			c = str.charAt(0);
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) > c)
				{
					c = str.charAt(i);
					Max = i;
				}
			}
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",str.charAt(i));
				if (i == Max)
				{
					System.out.printf("%s",substr);
				}
			}
			System.out.print("\n");
		}

	}
}
