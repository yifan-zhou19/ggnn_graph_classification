import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);
		s = new Scanner(System.in).nextLine(); //??????????
		int len = s.length(); //????
		int flag = 0;
		for (int i = 0; i < len; i++)
		{
			if (*(s.Substring(i)) >= '0' && *(s.Substring(i)) <= '9')
			{
				System.out.print((s.Substring(i)));
				flag++;
			} //???????????????1
			else if (*(s.Substring(i) + 1) >= 0 && *(s.Substring(i) + 1) <= '9' && flag != 0)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
