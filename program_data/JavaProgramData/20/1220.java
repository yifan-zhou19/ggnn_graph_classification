package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[10]);
		int first = 1;
		while (scanf("%s%s",str,substr) != EOF)
		{
			int i;
			int max = -1;
			int loc;
			int len;
		//	scanf("%s%s",&str,&substr);
			len = str.length();
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					loc = i;
				}
			}
			if (first == 0)
			{
				System.out.print("\n");
			}

			for (i = 0;i <= loc;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;i < substr.length();i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			for (i = loc + 1;i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			if (first != 0)
			{
				first = 0;
			}

		}
		return 0;
	}

}
