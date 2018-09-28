package <missing>;

public class GlobalMembers
{
	/*
	 * n1.cpp
	 *
	 *  Created on: 2011-11-12
	 *      Author: Administrator
	 */

	public static String a = new String(new char[6]);

	public static int judge(char x) //???????5????????
	{
		switch (x)
		{
		case 'A':
			return (a.charAt(1) == 'E');
			break;
		case 'B':
			return (a.charAt(2) == 'B');
			break;
		case 'C':
			return (a.charAt(5) == 'A');
			break;
		case 'D':
			return (a.charAt(1) != 'C');
			break;
		case 'E':
			return (a.charAt(1) == 'D');
			break;
		}
		return 0;
	}

	public static int Main()
	{
		final char[] r = {' ', 'A', 'B', 'C', 'D', 'E'};
		int[] step = new int[6];

		for (step[5] = 1;step[5] <= 5;step[5]++) //??5????
		{
			for (step[4] = 1;step[4] <= 5;step[4]++)
			{
				if (step[4] == step[5])
				{
					continue;
				}
				for (step[3] = 1;step[3] <= 5;step[3]++)
				{
					if (step[3] == step[4] || step[3] == step[5] || step[3] == 5)
					{
						continue;
					}
					for (step[2] = 1;step[2] <= 5;step[2]++)
					{
						if (step[2] == step[3] || step[2] == step[4] || step[2] == step[5] || step[2] == 5)
						{
							continue;
						}
						for (step[1] = 1;step[1] <= 5;step[1]++)
						{
							if (step[1] == step[2] || step[1] == step[3] || step[1] == step[4] || step[1] == step[5])
							{
								continue;
							}

							a = tangible.StringFunctions.changeCharacter(a, 1, r[step[1]]); //?a?????a??????
							a = tangible.StringFunctions.changeCharacter(a, 2, r[step[2]]);
							a = tangible.StringFunctions.changeCharacter(a, 3, r[step[3]]);
							a = tangible.StringFunctions.changeCharacter(a, 4, r[step[4]]);
							a = tangible.StringFunctions.changeCharacter(a, 5, r[step[5]]);

							if (judge(a.charAt(1)) + judge(a.charAt(2)) != 2)
							{
								continue; //????????
							}
							if (judge(a.charAt(3)) + judge(a.charAt(4)) + judge(a.charAt(5)) > 0)
							{
								continue;
							}

							int i;
							//?????     ????????????void?????????????????????
							//?cout???????????
							for (i = 1;i <= 5;i++)
							{
								if (a.charAt(i) == 'A')
								{
									System.out.print(i);
								}
							}
							for (i = 1;i <= 5;i++)
							{
								if (a.charAt(i) == 'B')
								{
									System.out.print(' ');
									System.out.print(i);
								}
							}
							for (i = 1;i <= 5;i++)
							{
								if (a.charAt(i) == 'C')
								{
									System.out.print(' ');
									System.out.print(i);
								}
							}
							for (i = 1;i <= 5;i++)
							{
								if (a.charAt(i) == 'D')
								{
									System.out.print(' ');
									System.out.print(i);
								}
							}
							for (i = 1;i <= 5;i++)
							{
								if (a.charAt(i) == 'E')
								{
									System.out.print(' ');
									System.out.print(i);
								}
							}
							return 0;
						}
					}
				}
			}
		}
	}

}

