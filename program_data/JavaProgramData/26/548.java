package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int flag = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c == ' ')
			{
				if (flag == 0)
				{
					flag = 1;
					System.out.printf("%c",c);
				}
				else
				{
					flag = 1;
				}
			}
			else
			{
				flag = 0;
			}
			if (flag == 0)
			{
				System.out.printf("%c",c);
			}
		}while (c != '\n');
	}
}

