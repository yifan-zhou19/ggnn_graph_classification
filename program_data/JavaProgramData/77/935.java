package <missing>;

public class GlobalMembers
{
	//*****************************************************************
	//????????????�????�                            *
	//????wayne                                                   *
	//?????11.25                                                 *
	//*****************************************************************
	public static int len;
	public static String str = new String(new char[1001]);
	public static char boy; //???????????????
	public static char girl;
	public static void operate()
	{
		int i;
		int j;
		for (i = 0;i <= len - 2;i++)
		{
			if (str.charAt(i) == boy) //????????
			{
				for (j = i + 1;j <= len - 1;j++)
				{
					if (str.charAt(j) == ' ')
					{
						continue;
					}
					else if (str.charAt(j) == girl) //???????????
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						str = tangible.StringFunctions.changeCharacter(str, j, ' '); //????????????????
						operate(); //??????
					}
					else
					{
						break;
					}
				}
			}
		}
	}
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = str.charAt(0); //?????????
		int i;
		len = str.length(); //????
		for (i = 1;;i++)
		{
			if (str.charAt(i) != boy) //??????????
			{
				girl = str.charAt(i); //??????girl
				break; //????????
			}
		}
		operate(); //????
		return 0;
	}
}

