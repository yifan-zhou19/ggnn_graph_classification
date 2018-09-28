package <missing>;

public class GlobalMembers
{
	//***********************************
	//** ???Dec 11, 2013 - ???? **
	//** ?????? 1300012719       **
	//** ???2013.12.13              **
	//***********************************
	public static int Main()
	{
		char[][] str = new char[2000][40]; //str??????(???????????????),letnum??????????
		int i;
		int n;
		int letnum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++) //????????????,???????????
		{
			*(str + i) = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print(str);
		letnum += String.valueOfstr.length();
		for (i = 1; i < n; i++)
		{
			if (String.valueOf(*(str + i)).length() + 1 + letnum <= 80)
			{
				System.out.print(" ");
				System.out.print((str + i));
				letnum += String.valueOf(*(str + i)).length() + 1;
			}
			else //??????,???????????
			{
				System.out.print("\n");
				System.out.print((str + i));
				letnum = String.valueOf(*(str + i)).length();
			}
		}
		System.out.print("\n");
		return 0;
	}

}

