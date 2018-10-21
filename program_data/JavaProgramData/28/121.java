package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char inputChar;
		char tmp;
		tmp = ' ';
		int num = 0;
		while (true)
		{
			inputChar = System.in.read();
			if (inputChar != '\n')
			{
				if (inputChar != ' ')
				{
					num++;
				}
				else
				{
					while (tmp == ' ')
					{
						tmp = System.in.read();
						if (tmp != ' ')
						{
							System.out.printf("%d,", num);
							tmp = ' ';
							num = 1;
							break;
						}
					}
				}
			}
			else
			{
				System.out.printf("%d", num);
				break;
			}
		}
		return 0;
	}
}
