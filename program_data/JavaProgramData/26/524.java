package <missing>;

public class GlobalMembers
{
	/*
	 * guolvduoyudekongge.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: dyj
	 */


	public static int Main()
	{
		String str = new String(new char[100]);
		int n = 0;
		int i;
		int j;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				for (j = i;str.charAt(j) == ' ';j++)
				{
					n++;
				}
				for (;str.charAt(j - 1) != '\0';j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j - n + 1, str.charAt(j));
				}
				n = 0;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

