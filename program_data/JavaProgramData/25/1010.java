package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String res = "0000000000000000000000000000001";
		final String temp = "0";
		int n;
		int i = 0;
		int j;
		int c = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i < n;i++)
		{
			for (j = 30;j >= 0 || (c == 0 && res.charAt(j) == '0');j--)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, 0, res.charAt(j));
				t = Integer.parseInt(temp) * 2 + c;
				res = tangible.StringFunctions.changeCharacter(res, j, t % 10 + '0');
				c = t / 10;
			}
		}
		for (i = 0;i < 31 && res.charAt(i) == '0';i++)
		{
			;
		}
		for (j = i;j < 31;j++)
		{
			res = tangible.StringFunctions.changeCharacter(res, j - i, res.charAt(j));
		}
		res = tangible.StringFunctions.changeCharacter(res, j - i, '\0');
		System.out.printf("%s\n",res);
		return 0;
	}

}

