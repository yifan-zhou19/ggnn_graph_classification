package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int flag1;
		int flag2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String c = new String(new char[200]);
		c = tangible.StringFunctions.changeCharacter(c, 0, '1');
		for (i = 1;i < 200;i++)
		{
			  c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}

		for (i = 1;i <= n;i++)
		{
			flag1 = 0,flag2 = 0;
		   for (j = 0;j <= k;j++)
		   {
				if (c.charAt(j) - '0' < 5)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 2 * c.charAt(j) - '0' + flag2);
					flag2 = 0;
				}
				else if (c.charAt(j) - '0' >= 5)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, (2 * (c.charAt(j) - '0')) % 10 + '0' + flag2);
					flag2 = 1;
					if (j == k)
					{
						flag1 = 1;
					}
				}
		   }
		   if (flag1 != 0)
		   {
				   k++;
				   c = tangible.StringFunctions.changeCharacter(c, k, '1');
		   }

		}
		for (i = 0;i <= k;i++)
		{
			   System.out.print(c.charAt(k - i));
		}
		return 0;
	}


}

