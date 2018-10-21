package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String num = new String(new char[5]);
		int i;
		int flag = 0;
		int j;
		for (i = 0;flag == 0;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				num = tangible.StringFunctions.changeCharacter(num, i, tempVar);
			}
			if (num.charAt(i) > '0' && num.charAt(i) <= '9')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
			}
		}
		for (j = i - 2;j >= 0;j--)
		{
			System.out.printf("%c",num.charAt(j));
		}


	}
}

