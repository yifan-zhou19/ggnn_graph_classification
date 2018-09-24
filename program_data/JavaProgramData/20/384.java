package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String p1 = str;
		String p2 = substr;
		int i;
		int j;
		int k;
		while (scanf("%s%s",str,substr) != EOF)
		{
			for (i = 0,k = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) > str.charAt(k))
				{
				k = i;
				}
			}

		for (j = 0;j <= k;j++)
		{
		  System.out.printf("%c",*(p1.Substring(j)));
		}
		System.out.printf("%s",substr);
		for (j = 0;str.charAt(k + 1 + j) != '\0';j++)
		{
		  System.out.printf("%c",*(p1.Substring(k) + 1 + j));
		}
		System.out.print("\n");
		}
	}
}
