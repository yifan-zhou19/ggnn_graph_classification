package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000010424_6.cpp
	* @author ???
	* @date 2010?11?24
	* @description
	* ??????:1049 ????    
	*/



	public static int Main()
	{
		int n; //?????????????
		int badNum;
		int i; //?????
		int j;
		int badTotal; //??????????????????
		int time;
		int place;
		int lastPlace;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			badNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			time = 0;
			badTotal = 0;
			lastPlace = 0;

			for (j = 1; j <= badNum; j++)
			{
				place = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				time += place - lastPlace; //???????????

				if (time < 60) //??????
				{
					if (time <= 57)
					{
						time += 3; //time????????
						badTotal += 3;
					}
					else
					{
						badTotal += 60 - time;
						time += 3;
					}
				}
				else
				{
					;
				}

				lastPlace = place;
			}

			System.out.print(60 - badTotal);
			System.out.print("\n");
		}

		return 0;
	}
}

