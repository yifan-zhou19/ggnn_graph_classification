package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c >= '0' && c <= '9')
			{
				System.out.printf("%c",c);
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

