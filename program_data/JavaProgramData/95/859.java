package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[2][80];
		str[0] = new Scanner(System.in).nextLine();
		str[1] = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < 80;i++)
		{
			if (str[0][i] > 96)
			{
				str[0][i] = str[0][i] - 32;
			}
			if (str[0][i] == '\0') //????????????????????
			{
				break;
			}
		}
		for (i = 0;i < 80;i++)
		{
			if (str[1][i] > 96)
			{
				str[1][i] = str[1][i] - 32;
			}
			if (str[1][i] == '\0') //????????????????????
			{
				break;
			}
		}
		if (strcmp(str[0],str[1]) > 0)
		{
			System.out.print(">");
		}
		else
		{
			if (strcmp(str[0],str[1]) == 0)
			{
				System.out.print("=");
			}
			else
			{
				System.out.print("<");
			}
		}
		return 0;
	}
}
