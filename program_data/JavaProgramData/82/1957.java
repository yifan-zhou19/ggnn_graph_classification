package <missing>;

public class GlobalMembers
{
	//******************************************************************************
	//???? ???? 
	//?????? 
	//???10-24 
	//******************************************************************************
	public static int Main()
	{
		int n;
		int[] shousuo = new int[100]; //????????
		int[] shuzhang = new int[100]; //????????
		int count = 0; //???????????
		int result = 0; //?????????????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++) //??????
		{
		shousuo[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shuzhang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int j = 0; j < n; j++) //?????count++?????result?????result
		{
			if (shousuo[j] >= 90 && shousuo[j] <= 140 && shuzhang[j] >= 60 && shuzhang[j] <= 90)
			{
				count++;

				if (count > result)
				{
				result = count;
				}
			}

			else //??????count=0?????result?????result
			{
				if (count >= result)
				{
				result = count;
				}

				count = 0;
			}
		}

		System.out.print(result);
		System.out.print("\n");

		return 0;
	}
}

