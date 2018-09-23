package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String p;
		int i;
		int j;
		int m;
		while (scanf("%s %s",str,substr) != EOF)
		{
			m = 0;
			p = str.charAt(0);
			for (i = 1; * (p.Substring(i)) != '\0';i++)
			{
				if (*(p.Substring(i)) > *(p.Substring(m)))
				{
					m = i;
				}
			}
			for (j = 0;j <= m;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (j = m + 1; * (p.Substring(j)) != '\0';j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.print("\n");
		}
	}
}
