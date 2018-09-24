package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String subs = new String(new char[4]);
		int l1;
		int i;
		int j;
		int max;
		while (scanf("%s%s",str,subs) != EOF)
		{
			l1 = str.length();

			max = 0;
			for (i = 0;i < l1;i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
			for (i = 0;i <= max;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",subs);
			for (i = max + 1;i < l1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
