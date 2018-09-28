package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[100]);
		while (i < n)
		{
			i++;
			fgets(str, 100, stdin);
			len = str.length() - 1;
			if (str.charAt(0) == '_' || Character.isLetter(str.charAt(0)))
			{
				for (int j = 0;j < len;j++)
				{
					if (!(str.charAt(j) == '_' || Character.isLetter(str.charAt(j)) || Character.isDigit(str.charAt(j))))
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
					else
					{
						if (j == len - 1)
						{
							System.out.print("yes");
							System.out.print("\n");
						}
					}
				}
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

