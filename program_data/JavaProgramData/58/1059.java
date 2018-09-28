import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????????C????????
	 * ?????
	 */

	public static int Main()
	{
		int n;
		int flag = 0; //flag????????
		int i = 0;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		while (n > 0)
		{
			String a = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
			flag = 0;
			i = 0;
			l = 0;
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == '_')
			{
			  flag = 1; //???????
			  i++;
			}
			l = a.length();
			while (flag != 0 && i < l)
			{
				if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
				{
				   flag = 1;
				   i++;
				} //??????????
				  else
				  {
				   flag = 0;
				  }
			}
			if (flag == 1)
			{
				System.out.print('1');
				System.out.print("\n");
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}

}

