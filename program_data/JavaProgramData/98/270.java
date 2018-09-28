package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[2000][20];
		(char)(*p)[20];
		String s;
		char sumlen = 0;
		char len;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = words;p - words < num;p++)
		{
			*p = ConsoleInput.readToWhiteSpace(true);
		}
		for (p = words;p - words < num;p++)
		{
			for (s = *p; s != 0;s++)
			{
				;
			}
			len = s - *p;
			if (sumlen + len + 1 < 80)
			{
				if (sumlen == 0)
				{
					System.out.print("\n");
					System.out.print(p);
					sumlen += len;
				}
				else
				{
					System.out.print(" ");
					System.out.print(p);
					sumlen += (len + 1);
				}
			}
			else
			{
				if (sumlen + len + 1 == 80)
				{
					sumlen = 0;
					System.out.print(" ");
					System.out.print(p);
				}
				else
				{
					sumlen = 0;
					p--;
				}
			}
		}
		return 0;
	}
}

