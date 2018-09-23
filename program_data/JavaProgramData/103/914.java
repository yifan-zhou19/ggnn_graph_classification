package <missing>;

public class GlobalMembers
{
	/*
	 * END2.cpp
	 * ??(12-5) ??????
	 *  Created on: 2013-1-10
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int k = 1;
		String c = new String(new char[1000]);
		char nowchar;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		while (i < c.length() - 1)
		{
			 if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			 {
				 nowchar = c.charAt(i) - 'a'+'A';
			 }
						else
						{
							nowchar = c.charAt(i);
						}
			while ((c.charAt(i + 1) == c.charAt(i) || c.charAt(i + 1) == c.charAt(i) - 'A'+'a' || c.charAt(i + 1) == c.charAt(i) - 'a'+'A'))
			{
				k++;
				i++;
			}
			System.out.print("(");
			System.out.print(nowchar);
			System.out.print(",");
			System.out.print(k);
			System.out.print(")");
			k = 1;
			i++;
		}
		if (c.charAt(c.length() - 1) != c.charAt(c.length() - 2))
		{
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				nowchar = c.charAt(i) - 'a'+'A';
			}
						else
						{
							nowchar = c.charAt(i);
						}
			System.out.print("(");
			System.out.print(nowchar);
			System.out.print(",1)");
		}
		return 0;
	}


}

