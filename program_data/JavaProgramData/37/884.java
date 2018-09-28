import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????????????????                                    **
	//*?????? 1100012907       **
	//*???2011.11.8                          **
	//****************************************
	public static int Main()
	{
		String str = new String(new char[100000]);
		int t;
		int i;
		int k;
		int p;
		int len;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????
		for (i = 1;i <= t; i++)
		{
			str = new Scanner(System.in).nextLine(); //?????
			len = str.length();
			for (p = 0; p < len; p++)
			{
				for (k = 0; k < len; k++)
				{
					if (str.charAt(k) == str.charAt(p) && k != p)
					{
						break; //????????
					}
				}
				if (k == len)
				{
					System.out.print(str.charAt(p));
					System.out.print("\n");
					break; //?????
				}
			}
			if (p == len)
			{
			System.out.print("no");
			System.out.print("\n");
			}
		}
		return 0;
	}
}

