package <missing>;

public class GlobalMembers
{
	//???????????????��
	public static int Main()
	{
		String kid = new String(new char[300]);
		kid = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int line = kid.length();
		int i;
		int j;
		char boy = kid.charAt(0);
		char girl = kid.charAt(line-1);
		for (i = 0;i < line;i++)
		{
			if (kid.charAt(i) == boy)
			{
				continue; //??????????
			}
			else if (kid.charAt(i) == girl)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (kid.charAt(j) == boy)
					{
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						kid = tangible.StringFunctions.changeCharacter(kid, i, ' ');
						kid = tangible.StringFunctions.changeCharacter(kid, j, ' ');
						break;
					}
				}
			} //?????????????????????????????????
		}
		return 0;
	}

}

