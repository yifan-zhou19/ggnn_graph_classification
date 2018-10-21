package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n = 0; //?????flag?????
		int x = 0;
		int flag = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //??????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		for (i = 1;i <= n;i++) //?????
		{
			for (j = 1;j <= 81;j++) //????????
			{
				str[j - 1] = 0;
			}
			flag = 0; //??????flag=0
			str = new Scanner(System.in).nextLine();
			x = str.length(); //????????
			if (str[0] < 'A' || (str[0]>'Z' && str[0] < '_') || (str[0]>'_' && str[0] < 'a') || str[0]>'z') //???????
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
			for (k = 2;k <= x;k++) //????????????????
			{
				if (str[k - 1] < '0' || (str[k - 1]>'9' && str[k - 1] < 'A') || (str[k - 1]>'Z' && str[k - 1] < '_') || (str[k - 1]>'_' && str[k - 1] < 'a') || str[k - 1]>'z')
				{
					flag = 1;
					break;
				}
			}
				if (flag == 0) //??flag??????????
				{
				System.out.print("1");
				System.out.print("\n");
				}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

