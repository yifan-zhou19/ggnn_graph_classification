package <missing>;

public class GlobalMembers
{
	public static int check(char x)
	{
		if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9' || x == '0')
		{
			return 1; //1??X???
		}
		else
		{
			return 0; //0??X????
		}
	}
	public static int Main()
	{
		String cha = new String(new char[30]);
		char[][] chaa = new char[30][30];
		cha = new Scanner(System.in).nextLine();
		int i = 0; //chec???????????
		int j = 0;
		int k = 0;
		int chec;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pi;
		pi = cha;
		for (; * pi != '\0';pi++)
		{
				chec = check(*pi);
				if (chec == 1)
				{
					chaa[i][j] = pi;
	//				printf("%c\n",chaa[i][j]);
					j += 1;
				}
				else if (chec == 0)
				{
					chaa[i][j] = '\0';
	//				printf("%s\n",chaa[0]);
					j = 0;
					i += 1;
				}
		}
		chaa[i][j] = '\0';
		for (k = 0;k <= i;k++)
		{
			if (check(chaa[k][0]) == 1)
			{
				System.out.printf("%s\n",chaa[k]);
			}
		}
		return 0;
	}
}
