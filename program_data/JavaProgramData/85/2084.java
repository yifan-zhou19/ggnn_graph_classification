package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int o;
		for (o = 0;o < n;o++)
		{
			String str = new String(new char[21]);
			int pan = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (str.charAt(0) == 95 || (str.charAt(0) <= 122 && str.charAt(0) >= 97) || (str.charAt(0) <= 90 && str.charAt(0) >= 65))
			{
				int i;
				for (i = 1;str.charAt(i) != '\0';i++)
				{
					if (str.charAt(i) == 95 || (str.charAt(i) <= 122 && str.charAt(i) >= 97) || (str.charAt(i) <= 90 && str.charAt(i) >= 65) || (str.charAt(i) <= 57 && str.charAt(i) >= 48))
					{
						pan = 1;
					}
					else
					{
						pan = 0;
						break;
					}
				}
			}
			else
			{
				pan = 0;
			}
			if (pan == 1)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}

		}
		return 0;
	}
}

