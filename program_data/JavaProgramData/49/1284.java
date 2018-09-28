package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[500]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 2;i <= c.length();i++)
		{
			for (int j = 0;j <= c.length() - i;j++)
			{
				int p = 1;
				for (int k = j;k < j + i / 2;k++)
				{

					if (c.charAt(k) != c.charAt(j + j + i - 1 - k))
					{
						p = 0;
						break;
					}

				}
				if (p == 1)
				{
					for (int o = j;o < j + i;o++)
					{
						System.out.print(c.charAt(o));
					}
					System.out.print("\n");
				}
			}
		}



		return 0;
	}
}

