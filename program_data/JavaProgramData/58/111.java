import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int f(String str) //?????????C++???
	{
		int g = 1; //g?????
		if ((str[0].compareTo(65) < 0) || (str[0].compareTo(122) > 0) || ((str[0].compareTo(90) > 0) && (str[0].compareTo(97) < 0) && (!str[0].equals(95))))
		{
			g = 0;
		}
		else
		{
			for (int i = 1;i <= 80;i++) //??????????????
			{
				if (!str[i].equals('\0')) //??????????????
				{
					if (((str[i].compareTo(65) >= 0) && (str[i].compareTo(90) <= 0)) || ((str[i].compareTo(97) >= 0) && (str[i].compareTo(122) <= 0)) || (str[i].equals(95)) || ((str[i].compareTo(48) >= 0) && (str[i].compareTo(57) <= 0)))
					{
					g = g * 1;
					}
					else
					{
					   g = 0;
					   break;
					}
				}
			}
		}
		return g;
	}
	public static int Main()
	{
		int n;
		char[][] str = new char[100][81]; //?????????
		int[] end = new int[100]; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++) //?????
		{
				str[i] = new Scanner(System.in).nextLine();
		}
		for (int i = 0;i < n;i++) //???????
		{
				end[i] = f(str[i]);
		}
		for (int i = 0;i < n;i++) //????
		{
				System.out.print(end[i]);
				System.out.print("\n");
		}
		return 0;
	}

}

