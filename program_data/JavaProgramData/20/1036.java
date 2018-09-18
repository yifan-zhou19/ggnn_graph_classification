package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			t = 0;
			for (i = 0;str.charAt(i);i++)
			{
				if (str.charAt(i) > t)
				{
					t = str.charAt(i);
				}
			}
		for (i = 0;str.charAt(i);i++)
		{
			if (str.charAt(i) < t)
			{
				System.out.printf("%c",str.charAt(i));
			}
			else
			{
				System.out.printf("%c",str.charAt(i));
				System.out.printf("%s",substr);
				break;
			}
		}
		for (j = i + 1;str.charAt(j);j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		System.out.print("\n");
		}
		return 0;
	}
}
