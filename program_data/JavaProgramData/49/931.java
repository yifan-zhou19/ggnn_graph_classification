package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int len;
		String x = new String(new char[510]);
		String temp = new String(new char[510]);
		String tran = new String(new char[510]);
		String p = x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		len = x.length();
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k, x.charAt(j + k));
					temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
				}
				for (k = 0;k < i;k++)
				{
					tran = tangible.StringFunctions.changeCharacter(tran, i - k - 1, temp.charAt(k));
				}
				tran = tangible.StringFunctions.changeCharacter(tran, i, '\0');
				if (strcmp(temp,tran) == 0)
				{
					System.out.printf("%s\n",temp);
				}

			}
		}
		return 0;
	}

}

