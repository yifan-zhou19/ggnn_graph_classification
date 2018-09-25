package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[150]);
		char girl;
		line = new Scanner(System.in).nextLine();
		 int len = line.length();
		char boy = line.charAt(0);
		for (int i = 0;i < len;i++)
		{
			if (line.charAt(i) != boy)
			{
				girl = line.charAt(i);
				break;
			}
		}
		for (int i = 0;i < len;i++)
		{
			if (line.charAt(i) == girl)
			{
				for (int j = i - 1;j >= 0;j--)
				{
					if (line.charAt(j) == boy)
					{
						System.out.printf("%d %d\n",j,i);
						line = tangible.StringFunctions.changeCharacter(line, j, ' ');
						break;
					}
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}


}

