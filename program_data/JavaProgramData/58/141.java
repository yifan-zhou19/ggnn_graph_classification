import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????C????????
	 * ??? ???
	 * ????: 2010-11-26
	 * ????????C????????
	 */



	public static int Main()
	{
		String str = new String(new char[81]); //???
		int n;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = new Scanner(System.in).nextLine(); //?????'\n'
		while (i < n)
		{
			str = new Scanner(System.in).nextLine();
			if (str.charAt(0) == '_' || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z'))
			{
				int len = str.length();
				int j;
				for (j = 1; j < len; j++)
				{ //??????????
					if (str.charAt(j) != '_' && (str.charAt(j) < 'A' || str.charAt(j)>'Z') && (str.charAt(j) < 'a' || str.charAt(j)>'z') && (str.charAt(j) < '0' || str.charAt(j)>'9'))
					{
						break;
					}
				}
				if (j == len)
				{
					System.out.print(1);
					System.out.print("\n");
					i++;
					continue;
				} //??????????????1
			}
			System.out.print(0);
			System.out.print("\n");
			i++;
		}
		return 0;
	}

}

