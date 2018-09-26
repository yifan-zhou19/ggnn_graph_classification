import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************
	//*???????.cpp              *
	//*??????                    *
	//*???2011-11-23                *
	//**********************************


	public static String str = new String(new char[101]); //??????
	public static void function(tangible.RefObject<String> q, int flag) //??flag???????????????????????????0??????1
	{
		if (q.argValue == null)
		{
			return; //??????????????
		}
		if (q.argValue != ' ')
		{
			System.out.print(q.argValue);
			flag = 1;
		}
		else
		{
			if (flag != 0)
			{
				System.out.print(" ");
				flag = 0;
			}
		}
			return function(q.argValue.Substring(1), flag); //???????
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine(); //?????
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		function(tempRef_str, 0); //???????????
		str = tempRef_str.argValue;
		return 0;
	}

}

