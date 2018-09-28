import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @author ??
	* @date 2010-12-8
	* @description
	* ??????:???? 
	*/

	public static int Main()
	{
		int flag = 1;
		int count = 0;
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		String a = str;
		for (int i = 0; * (a.Substring(i)) != '\0'; i++)
		{
			if (*(a.Substring(i)) >= 48 && *(a.Substring(i)) <= 57)
			{
				if (flag == 0)
				{
					flag = 1;
				}
				if (flag == 1)
				{
					count++;
				}
				flag = 2;
				System.out.print((a.Substring(i)));
			}
			else
			{
				if (flag != 0)
				{
					System.out.print("\n");
				}
				flag = 0;
			}
		}
		System.out.print("\n");

		return 0;
	}



}
