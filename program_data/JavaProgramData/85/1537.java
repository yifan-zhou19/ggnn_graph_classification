package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int biaoji = 0;
		final String zifu = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			zifu = tangible.StringFunctions.changeCharacter(zifu, i, ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (biaoji == 1)
			{
				break;
			}
			for (j = 0;j < String.valueOf(zifu.charAt(i)).length();j++)
			{
				if (biaoji == 1)
				{
					break;
				}
				if ((zifu.charAt(i)[0] >= 65 && zifu.charAt(i)[0] <= 90) || (zifu.charAt(i)[0] >= 97 && zifu.charAt(i)[0] <= 122) || zifu.charAt(i)[0] == 95)
				{
					if ((zifu.charAt(i)[j] >= 48 && zifu.charAt(i)[j] <= 57) || (zifu.charAt(i)[j] >= 65 && zifu.charAt(i)[j] <= 90) || (zifu.charAt(i)[j] >= 97 && zifu.charAt(i)[j] <= 122) || zifu.charAt(i)[j] == 95)
					{
						continue;
					}
					else
					{
						biaoji = 1;
						System.out.print("no");
						System.out.print("\n");
					}
				}
				else
				{
					biaoji = 1;
					System.out.print("no");
					System.out.print("\n");
				}
			}
			if (biaoji == 0)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			biaoji = 0;
		}
			return 0;
	}
}

