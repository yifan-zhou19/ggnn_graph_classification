package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int now;
		char c;
		char x;
		c = ' ';
		now = 1;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		if (c >= 97)
		{
			c = c - 32;
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			if (x == c || x - c == 32)
			{
				now++;
			}
			else
			{
				System.out.printf("(%c,%d)",c,now);
				now = 1;
				c = x;
				if (c >= 97)
				{
					c = c - 32;
				}
			}
		} while (c != '\n');
	return 0;
	}


}

