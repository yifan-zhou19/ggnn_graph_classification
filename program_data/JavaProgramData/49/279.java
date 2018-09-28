package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[501]);
		String p;
		int l; //l--????
		int i;
		int j;
		int k;
		int len;
		int flag = 1;
		for (i = 0;i < 500;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
			if (c.charAt(i) == '\n')
			{
				len = i + 1;
				break;
			}
		}
		for (l = 2;l <= len;l++)
		{
			for (j = 0;j <= len - l;j++)
			{
				p = c.charAt(j);
				flag = 1;
				for (k = 0;k < l / 2;k++)
				{
					if (*(p.Substring(k)) != *(p.Substring(l) - 1 - k))
					{
						flag *= 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (k = 0;k < l;k++)
					{
						System.out.printf("%c",*(p.Substring(k)));
					}
					System.out.print("\n");
				}

			}
		}
	}




}

