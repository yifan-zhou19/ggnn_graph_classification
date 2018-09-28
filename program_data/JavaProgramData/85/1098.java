package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int first = 1;
		int no = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (;n > 0;n--)
		{
			c = System.in.read();
			while (c != '\n')
			{
				if (first != 0)
				{
					if (!(Character.isLetter(c) || c == '_'))
					{
						no = 1;
						break;
					}
					else
					{
						first = 0;
					}
				}
				else
				{
					if (!(Character.isLetterOrDigit(c) || c == '_'))
					{
						no = 1;
						break;
					}
				}
				c = System.in.read();
			}
			if (no != 0)
			{
				System.out.print("no\n");
				while (c != '\n')
				{
					c = System.in.read();
				}
			}
			else
			{
				System.out.print("yes\n");
			}
			first = 1;
			no = 0;
		}

	}
}

