package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int t = 0;
		char c;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c == '\n')
			{
				if (i != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",t);
				break;
			}
			else if (c == ' ')
			{
				if (t == 0)
				{
					continue;
				}
				else
				{
				if (i != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",t);
				t = 0;
				i = 1;
				}
			}
			else
			{
				t++;
			}
		}
		return 0;
	}
}

