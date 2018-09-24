package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			int i;
			int m = 0;
			char max = str.charAt(0);
			for (i = 1;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			int p = substr.length();
			for (i = 0;i < p;i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			int q = str.length();
			for (i = m + 1;i < q;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}

	}

}
