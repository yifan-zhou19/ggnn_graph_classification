package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String num = new String(new char[256]);
		for (int i = 0;i <= n;i++)
		{

			num = new Scanner(System.in).nextLine();
			for (int j = 0;j <= 255;j++)
			{
				if (num.charAt(j) == 'A')
				{
				num = tangible.StringFunctions.changeCharacter(num, j, 'T');
				}
				else if (num.charAt(j) == 'C')
				{
				num = tangible.StringFunctions.changeCharacter(num, j, 'G');
				}
				else if (num.charAt(j) == 'G')
				{
				num = tangible.StringFunctions.changeCharacter(num, j, 'C');
				}
				else if (num.charAt(j) == 'T')
				{
				num = tangible.StringFunctions.changeCharacter(num, j, 'A');
				}
				if (num.charAt(j) == '\0')
				{
					System.out.printf("%s\n",num);
					break;
				}
			}
		}
		return 0;
	}

}

