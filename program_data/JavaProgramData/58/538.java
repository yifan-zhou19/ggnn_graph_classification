import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**************************************
	//* ????????C????????  *
	//* ?????                         *
	//**************************************
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int count = 0;
		int first = 1;
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		for (i = 0;i < n;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
		}
			for (i = 0;i < n;i++,first = 1,count = 0,j = 0)
			{
			while (c[i][j] != 0) //????'\0'??
			{
				if (first != 0) //?????????
				{
					if ((c[i][j] >= 65 && c[i][j] <= 90) || (c[i][j] >= 97 && c[i][j] <= 122) || (c[i][j] == 95))
					{
						count++; //count?????????????
						first = 0;
						j++; //j??????????
					}
					else
					{
						   j++;
						break;
					}

				}
				else //???????????
				{
					if ((c[i][j] >= 65 && c[i][j] <= 90) || (c[i][j] >= 97 && c[i][j] <= 122) || (c[i][j] == 95) || (c[i][j] >= 48 && c[i][j] <= 57))
					{
						count++;
						j++;
					}
					else
					{
						j++;
						break;
					}
				}
			}
							if (count == j) //??????????????????
							{
								System.out.print(1);
								System.out.print("\n");
							}
							else
							{
								System.out.print(0);
								System.out.print("\n");
							}
			}
		return 0;
	}
}

