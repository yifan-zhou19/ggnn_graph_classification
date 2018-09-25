package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title:??              **
	//**Author:???1300017687 **
	//**Date?2013.10.30        **
	//**File?1.cpp             **
	//****************************
	public static int Main()
	{
		while (true)
		{
			int[] num = new int[16]; //???????15????,???????????????0
			num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[0] == -1) //????????-1
			{
				break; //????,????
			}

			int sum = 1; //sum????????
			for (; ;sum++)
			{
				num[sum] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[sum] == 0) //????0,?????
				{
					sum--; //?sum??
					break; //??????
				}
			}
			int twice = 0; //twice?????????
			for (int i = 0 ; i < sum ; i++) //????i?????
			{
				for (int j = i + 1 ; j <= sum ; j++)
				{
					//??num[j]?num[i]??????
					if ((num[j] == 2 * num[i]) || (num[i] == 2 * num[j]))
					{
						twice++; //??????
					}
				}
			}
			System.out.print(twice);
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

