package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int state;
		int status;
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			status = 1;
			for (j = 0;j < str.length();j++)
			{
				state = 0;
				if (str.charAt(j) != 1)
				{
					for (k = j + 1;k < str.length();k++)
					{
						if (str.charAt(j) == str.charAt(k))
						{
							str = tangible.StringFunctions.changeCharacter(str, k, 1);
							state = 1;
						}
					}
				}
				if (state != 0)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, 1);
				}
			}
			for (j = 0;j < str.length();j++)
			{
				if (str.charAt(j) != 1)
				{
					System.out.printf("%c\n",str.charAt(j));
					status = 0;
					break;
				}
			}
			if (status != 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

