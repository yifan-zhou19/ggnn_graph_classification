package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//???????????????????????????????
		String c = new String(new char[31]);
		int i;
		int j;
		int sum;
		c = new Scanner(System.in).nextLine();
	//??????????????c[0]???�+�??????????????
		for (i = 30;i >= 1;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i - 1));
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, '+');
	//??????????????????
		sum = 0;
		for (i = 1;i < 31;i++)
		{
			   if ((c.charAt(i - 1) != '-') && (c.charAt(i) >= '0') && (c.charAt(i) <= '9'))
			   {
				   sum = sum + 1;
				   for (j = i;(c.charAt(j) >= '0') && (c.charAt(j) <= '9');j++)
				   {
					   System.out.printf("%c",c.charAt(j));
				   }
				   System.out.print("\n");
				   i = j;
			   }
		}
		 return 0;
	}
}

