package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] d =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String p1;
		String p3;
		String p2;
		String longest = new String(new char[30]);
		String shortest = new String(new char[30]);
		int i = 0;
		int j = 0;
		int k = 0;
		int flag = 1;
		a = new Scanner(System.in).nextLine();

		p1 = a;
		while (*(p1.Substring(i)))
		{
			if (*(p1.Substring(i)) != ' ')
			{
				d[j][k] = (p1.Substring(i));
				k++;
			}
			if (*(p1.Substring(i)) == ' ')
			{
				j++;
				k = 0;
			}
			i++;
		}
		longest = d[0];
		shortest = d[0];
		for (k = 0;k < j + 1;k++)
		{
			if (String.valueOf(d[k]).length() > longest.length())
			{
				longest = d[k];
			}
			if (String.valueOf(d[k]).length() < shortest.length())
			{
				shortest = d[k];
			}
		}

		System.out.printf("%s",longest);
		System.out.print("\n");
		System.out.printf("%s",shortest);
		System.out.print("\n");
		return 0;
	}
}
