import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: word_reverse.cpp
	 *??: ???
	 *????: 2012-11-08
	 *??: ????
	 */



	public static int Main()
	{
		char[][] str = new char[2][120];
		int k; //????????????????
		int we;
		str[0] = new Scanner(System.in).nextLine();

		we = String.valueOf(str[0]).length();
		k = 0;
		for (int i = we-1;i >= 0;i--)
		{
			if (i == 0)
			{
				if (k != 0)
				{
					str[1][k++] = ' ';
				}
				for (int j = 0;j < we;j++)
				{
					str[1][k++] = str[0][j];
				}
				str[1][k] = 0;
			}
			else if (str[0][i] == ' ')
			{
				if (k != 0)
				{
					str[1][k++] = ' ';
				}
				for (int j = i + 1;j < we;j++)
				{
					str[1][k++] = str[0][j];
				}
				str[1][k] = 0;
				we = i;
			}
		}
		System.out.print(str[1]);
		System.out.print("\n");
		return 0;
	}



}
