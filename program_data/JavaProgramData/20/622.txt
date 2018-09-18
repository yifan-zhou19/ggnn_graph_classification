package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10]);
		String s = new String(new char[10]);
		char p;
		int i;
		int t;
		while (scanf("%s",str) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			p = str.charAt(0);
			t = 0;
			for (i = 1;i < str.length();i++)
			{
				if (str.charAt(i) > p)
				{
					p = str.charAt(i);
					t = i;
				}

			}
			for (i = 0;i <= t;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",s);
			for (i = t + 1;i < str.length();i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");

		}
	}
}

