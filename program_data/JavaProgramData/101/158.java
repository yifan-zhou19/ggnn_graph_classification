package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?????
		int b;
		int c;
		int worda; //???????
		int wordb;
		int wordc;
		String rank = new String(new char[4]); //????????????
		char[] final = {0, '\0', '\0'}; //?????????
		for (a = 1;a <= 3;a++) //??????
		{
				   for (b = 1;b <= 3;b++)
				   {
									if (b == a)
									{
										continue;
									}
									c = (6 - a - b);
									worda = (a > b) + (a == c); //????????
									wordb = (a < b) + (a < c);
									wordc = (b > c) + (b < a);
									if (worda == (a - 1) && wordb == (b - 1) && wordc == (c - 1)) //??????
									{
										   rank = tangible.StringFunctions.changeCharacter(rank, a, 'A'); //?????
										   rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
										   rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
										   for (int i = 1;i <= 3;i++)
										   {
												   final[i - 1] = rank.charAt(4 - i); //???????????
										   }

									}
				   }


		}
			System.out.print(final);
			System.out.print("\n");
			return 0;
	}
}

