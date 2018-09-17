package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d = 26;
		int p = 1;
		char c;
		while (scanf("%c", c), c != '\n')
		{
			if (c >= 'A' && c <= 'Z')
			{
				c = c - 'A';
			}
			if (c >= 'a' && c <= 'z')
			{
				c = c - 'a';
			}
			if (d >= 26)
			{
				d = c;
			}
			else if (d != c)
			{
				System.out.printf("(%c,%d)", d + 'A', p);
				p = 1;
				d = c;
			}
			else
			{
				p++;
			}
		}
		 System.out.printf("(%c,%d)", d + 'A', p);
	   return 0;
	}
}
