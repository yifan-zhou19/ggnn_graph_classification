import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??????
	 *?????zhizhen3.cpp
	 *Created on: 2012-12-10
	 *???????
	 */
	public static int Main()
	{
		String t;
		String cha = new String(new char[500]);
		int i; //???????
		cha = new Scanner(System.in).nextLine(); //???????
		t = cha;
		for (i = 0; * (t.Substring(i)) != '\0';i++)
		{
			if ((*(t.Substring(i)) == ' ') && (*(t.Substring(i) + 1) == ' '))
			{
			continue;
			}
		else
		{
			System.out.print((t.Substring(i)));
		}
		}
		System.out.print("\n");
		return 0; //????
	}

}
