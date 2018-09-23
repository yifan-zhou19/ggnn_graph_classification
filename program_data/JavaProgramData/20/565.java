package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char k = 0;
		char j = 0;
		char len;
		char i;
		char h;
		int max = -2000;
		while (scanf("%s%s",s1,s2) != EOF)
		{
				len = s1.length();
				max = -2000;
				for (h = 0;h < len;h++)
				{
					if (s1.charAt(h) > max)
					{
						max = s1.charAt(h);
						i = h;
					}
				}
				for (h = 0;h <= i;h++)
				{
				System.out.printf("%c",s1.charAt(h));
				}
				System.out.printf("%s",s2);
				for (h = i + 1;h < len;h++)
				{
				System.out.printf("%c",s1.charAt(h));
				}
				System.out.print("\n");
		}
	}

}
