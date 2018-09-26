package <missing>;

public class GlobalMembers
{
	/*
	name:??2?N??
	writer:???
	time:2013.11.14
	*/
	public static int Main()
	{
		int n;
		int i;
		int num;
		int j;
		int len = 1;
		int m;
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'0',99); //???
		str = tangible.StringFunctions.changeCharacter(str, 99, '1'); //??????0
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 100 - len ; j <= 99 ; j++)
			{
				num = str.charAt(j) - '0';
				if (str.charAt(j) <= '4')
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) + num); //0-4????
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) + num - 10); //5-9????10
					for (m = j - 1 ;;m--)
					{
						if (m == 99 - len) //????
						{
							len++;
						}
						if (str.charAt(m) == '9') //??
						{
							str = tangible.StringFunctions.changeCharacter(str, m, '0');
							str.charAt(m - 1)++;
						}
						else
						{
							str.charAt(m)++;
							break;
						}
					}
				}
			}
		}
		for (j = 100 - len ; j <= 99 ; j++) //??????
		{
			System.out.print(str.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

