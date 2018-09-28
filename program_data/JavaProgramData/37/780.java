package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int String;
		int i;
		int j;
		int len;
		int re = 0;
		String str = new String(new char[100000]);
		char output = 'Z';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (string = 0;String < n;string++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (j = 0;j < len;j++)
			{
				for (i = 0;i < len;i++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						re++;
					}
					if (re == 2)
					{
						break;
					}
					if (i == len - 1)
					{
						output = str.charAt(j);
						System.out.printf("%c\n",output);
					}
				}
				re = 0;
				if (output != 'Z')
				{
					output = 'Z';
					break;
				}
				else if (j == len - 1 && output == 'Z')
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}

}

