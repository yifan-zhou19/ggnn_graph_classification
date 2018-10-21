package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n;i++)
		{
			String a = new String(new char[81]);
			int t = 1;
			a = new Scanner(System.in).nextLine(); //????
			int l = a.length();
			if (i != 0)
			{
			if (!(a.charAt(0) == 95 || (a.charAt(0) >= 97 && a.charAt(0) <= 122) || (a.charAt(0) >= 65 && a.charAt(0) <= 90)))
			{
				t = 0; //???????????????
			}
			for (int j = 1;j < l;j++)
			{
				if (!((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || a.charAt(j) == '_')) //???????
				{
					t = 0;
				}
			}
			System.out.print(t);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

