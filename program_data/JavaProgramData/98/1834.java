package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		int count1 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[1000][40];
		for (i = 0;i < n;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = str[0][0];
		for (i = 0;i < n;i++)
		{ //????
			p = str[i][0]; //???????????????
			for (j = 0;j < 40;j++)
			{
				if (*p != '\0')
				{
					count++; //??????????????
					p++;
				}
				else
				{
					break; //??????
				}
			}
			count++; //???????
			if (count - 1 <= 80)
			{
				if (count1 == 0)
				{
					System.out.print(str[i]);
					count1 = 1;
				} //?????? ?????????
				else
				{
					System.out.print(" ");
					System.out.print(str[i]);
				}
			}
			if (count - 1 > 80)
			{ //?????????????
				i--;
				System.out.print("\n");
				count = 0;
				count1 = 0;
			}
		}
		System.out.print("\n");
	}

}

