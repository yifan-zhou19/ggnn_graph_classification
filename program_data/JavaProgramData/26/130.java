import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*********************************
	//*??????                         *
	//*???????????         *
	//*???11?22?                 *
	//*********************************
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int lena = 0;
		String str = new String(new char[102]);
		str = new Scanner(System.in).nextLine(); //??????????????
		lena = str.length(); //?????????
		for (i = 0;i <= lena - 1;i++)
		{
			if (str.charAt(i) != ' ' || (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')) //??????????
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}

}
