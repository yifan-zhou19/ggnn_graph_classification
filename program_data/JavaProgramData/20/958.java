package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			int i;
			int pos = 0;
			for (i = 1;str.charAt(i);i++)
			{
				if (str.charAt(i) > str.charAt(pos))
				{
					pos = i;
				}
			}
			for (i = 0;i <= pos;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			while (str.charAt(i) != null)
			{
				System.out.printf("%c",str.charAt(i++));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
