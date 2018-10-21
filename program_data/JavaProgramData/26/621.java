import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************
	//*   ???????               *
	//*   ??????                 *
	//*   ?????2011?10?31?     *
	//**********************************


	public static int Main()
	{
		int i;
		int n;
		int flag;
		String Sen = new String(new char[101]);
		Sen = new Scanner(System.in).nextLine(); //?????(???)
		n = Sen.length(); //n????????
		flag = 0; //flag???????,??????0
		for (i = 0; i < n; i++)
		{
			if (Sen.charAt(i) != ' ')
			{
				System.out.print(Sen.charAt(i));
				flag = 1; //???flag???1
			}
			else //??????
			{
				if (flag == 1) //???????????
				{
					System.out.print(" ");
					flag = 0; //??flag??0
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}
