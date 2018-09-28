import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************************************
	//* ???: ?????C????????             *
	//* ??  ????????????C???????? *
	//* ??????                                    *
	//* ?? ?2010?11?20?                           *
	//***************************************************
	public static int Main()
	{
		int n;
		int i;
		int p = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str = new String(new char[81]); //????????
		while (p <= n) //while??????
		{
			str = new Scanner(System.in).nextLine(); //???????
			if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' || str.charAt(0) == '_')
			{
				if (str.length() == 1)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				for (i = 1; str.charAt(i) != '\0'; i++)
				{
					if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == '_'))
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					} //??????????????????????????????? 0
					else if (i == str.length() - 1)
					{
						System.out.print(1);
						System.out.print("\n");
					}
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
			p++;
		}
		return 0;
	}
}

